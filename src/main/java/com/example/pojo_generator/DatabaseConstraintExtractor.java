package com.example.pojo_generator;

import java.sql.*;
import java.util.*;

/**
 * Utility class to extract database constraint information from PostgreSQL
 * to generate constraint-aware POJOs
 */
public class DatabaseConstraintExtractor {
    
    private final String jdbcUrl;
    private final String username;
    private final String password;
    
    public DatabaseConstraintExtractor(String jdbcUrl, String username, String password) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
    }
    
    /**
     * Extract all constraint information for business tables (excluding system tables)
     */
    public Map<String, TableConstraints> extractConstraints() throws SQLException {
        Map<String, TableConstraints> tableConstraints = new HashMap<>();
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Get all business tables (exclude pg_* and information_schema tables)
            Set<String> businessTables = getBusinessTables(conn);
            
            for (String tableName : businessTables) {
                TableConstraints constraints = new TableConstraints(tableName);
                
                // Extract column information
                extractColumnInfo(conn, tableName, constraints);
                
                // Extract NOT NULL constraints
                extractNotNullConstraints(conn, tableName, constraints);
                
                // Extract CHECK constraints
                extractCheckConstraints(conn, tableName, constraints);
                
                // Extract UNIQUE constraints
                extractUniqueConstraints(conn, tableName, constraints);
                
                // Extract PRIMARY KEY constraints
                extractPrimaryKeyConstraints(conn, tableName, constraints);
                
                // Extract FOREIGN KEY constraints
                extractForeignKeyConstraints(conn, tableName, constraints);
                
                tableConstraints.put(tableName, constraints);
            }
        }
        
        return tableConstraints;
    }
    
    private Set<String> getBusinessTables(Connection conn) throws SQLException {
        Set<String> tables = new HashSet<>();
        String sql = "SELECT table_name " +
                    "FROM information_schema.tables " +
                    "WHERE table_schema = 'public' " +
                    "AND table_type = 'BASE TABLE' " +
                    "AND table_name NOT LIKE 'pg_%' " +
                    "AND table_name NOT LIKE 'information_schema%' " +
                    "AND table_name NOT IN ('databasechangelog', 'databasechangeloglock') " +
                    "ORDER BY table_name";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                tables.add(rs.getString("table_name"));
            }
        }
        
        return tables;
    }
    
    private void extractColumnInfo(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT column_name, data_type, character_maximum_length, " +
                    "numeric_precision, numeric_scale, is_nullable, column_default " +
                    "FROM information_schema.columns " +
                    "WHERE table_name = ? AND table_schema = 'public' " +
                    "ORDER BY ordinal_position";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    ColumnInfo columnInfo = new ColumnInfo(
                        rs.getString("column_name"),
                        rs.getString("data_type"),
                        rs.getObject("character_maximum_length", Integer.class),
                        rs.getObject("numeric_precision", Integer.class),
                        rs.getObject("numeric_scale", Integer.class),
                        "YES".equals(rs.getString("is_nullable")),
                        rs.getString("column_default")
                    );
                    constraints.addColumnInfo(columnInfo);
                }
            }
        }
    }
    
    private void extractNotNullConstraints(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT column_name " +
                    "FROM information_schema.columns " +
                    "WHERE table_name = ? AND table_schema = 'public' AND is_nullable = 'NO'";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    constraints.addNotNullColumn(rs.getString("column_name"));
                }
            }
        }
    }
    
    private void extractCheckConstraints(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT cc.constraint_name, cc.check_clause " +
                    "FROM information_schema.check_constraints cc " +
                    "JOIN information_schema.constraint_column_usage ccu " +
                    "ON cc.constraint_name = ccu.constraint_name " +
                    "WHERE ccu.table_name = ? AND ccu.table_schema = 'public'";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    CheckConstraint checkConstraint = new CheckConstraint(
                        rs.getString("constraint_name"),
                        rs.getString("check_clause")
                    );
                    constraints.addCheckConstraint(checkConstraint);
                }
            }
        }
    }
    
    private void extractUniqueConstraints(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT tc.constraint_name, array_agg(kcu.column_name ORDER BY kcu.ordinal_position) as columns " +
                    "FROM information_schema.table_constraints tc " +
                    "JOIN information_schema.key_column_usage kcu " +
                    "ON tc.constraint_name = kcu.constraint_name " +
                    "WHERE tc.table_name = ? AND tc.table_schema = 'public' " +
                    "AND tc.constraint_type = 'UNIQUE' " +
                    "GROUP BY tc.constraint_name";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Array columnsArray = rs.getArray("columns");
                    Object[] objectArray = (Object[]) columnsArray.getArray();
                    String[] columns = new String[objectArray.length];
                    for (int i = 0; i < objectArray.length; i++) {
                        columns[i] = objectArray[i].toString();
                    }
                    UniqueConstraint uniqueConstraint = new UniqueConstraint(
                        rs.getString("constraint_name"),
                        Arrays.asList(columns)
                    );
                    constraints.addUniqueConstraint(uniqueConstraint);
                }
            }
        }
    }
    
    private void extractPrimaryKeyConstraints(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT tc.constraint_name, array_agg(kcu.column_name ORDER BY kcu.ordinal_position) as columns " +
                    "FROM information_schema.table_constraints tc " +
                    "JOIN information_schema.key_column_usage kcu " +
                    "ON tc.constraint_name = kcu.constraint_name " +
                    "WHERE tc.table_name = ? AND tc.table_schema = 'public' " +
                    "AND tc.constraint_type = 'PRIMARY KEY' " +
                    "GROUP BY tc.constraint_name";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Array columnsArray = rs.getArray("columns");
                    Object[] objectArray = (Object[]) columnsArray.getArray();
                    String[] columns = new String[objectArray.length];
                    for (int i = 0; i < objectArray.length; i++) {
                        columns[i] = objectArray[i].toString();
                    }
                    PrimaryKeyConstraint pkConstraint = new PrimaryKeyConstraint(
                        rs.getString("constraint_name"),
                        Arrays.asList(columns)
                    );
                    constraints.setPrimaryKeyConstraint(pkConstraint);
                }
            }
        }
    }
    
    private void extractForeignKeyConstraints(Connection conn, String tableName, TableConstraints constraints) throws SQLException {
        String sql = "SELECT " +
                    "tc.constraint_name, " +
                    "kcu.column_name, " +
                    "ccu.table_name AS foreign_table_name, " +
                    "ccu.column_name AS foreign_column_name " +
                    "FROM information_schema.table_constraints AS tc " +
                    "JOIN information_schema.key_column_usage AS kcu " +
                    "ON tc.constraint_name = kcu.constraint_name " +
                    "JOIN information_schema.constraint_column_usage AS ccu " +
                    "ON ccu.constraint_name = tc.constraint_name " +
                    "WHERE tc.constraint_type = 'FOREIGN KEY' " +
                    "AND tc.table_name = ? AND tc.table_schema = 'public'";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    ForeignKeyConstraint fkConstraint = new ForeignKeyConstraint(
                        rs.getString("constraint_name"),
                        rs.getString("column_name"),
                        rs.getString("foreign_table_name"),
                        rs.getString("foreign_column_name")
                    );
                    constraints.addForeignKeyConstraint(fkConstraint);
                }
            }
        }
    }
    
    // Data classes for constraint information
    public static class TableConstraints {
        private final String tableName;
        private final Map<String, ColumnInfo> columns = new HashMap<>();
        private final Set<String> notNullColumns = new HashSet<>();
        private final List<CheckConstraint> checkConstraints = new ArrayList<>();
        private final List<UniqueConstraint> uniqueConstraints = new ArrayList<>();
        private PrimaryKeyConstraint primaryKeyConstraint;
        private final List<ForeignKeyConstraint> foreignKeyConstraints = new ArrayList<>();
        
        public TableConstraints(String tableName) {
            this.tableName = tableName;
        }
        
        // Getters and setters
        public String getTableName() { return tableName; }
        public Map<String, ColumnInfo> getColumns() { return columns; }
        public Set<String> getNotNullColumns() { return notNullColumns; }
        public List<CheckConstraint> getCheckConstraints() { return checkConstraints; }
        public List<UniqueConstraint> getUniqueConstraints() { return uniqueConstraints; }
        public PrimaryKeyConstraint getPrimaryKeyConstraint() { return primaryKeyConstraint; }
        public List<ForeignKeyConstraint> getForeignKeyConstraints() { return foreignKeyConstraints; }
        
        public void addColumnInfo(ColumnInfo columnInfo) {
            columns.put(columnInfo.getColumnName(), columnInfo);
        }
        
        public void addNotNullColumn(String columnName) {
            notNullColumns.add(columnName);
        }
        
        public void addCheckConstraint(CheckConstraint checkConstraint) {
            checkConstraints.add(checkConstraint);
        }
        
        public void addUniqueConstraint(UniqueConstraint uniqueConstraint) {
            uniqueConstraints.add(uniqueConstraint);
        }
        
        public void setPrimaryKeyConstraint(PrimaryKeyConstraint primaryKeyConstraint) {
            this.primaryKeyConstraint = primaryKeyConstraint;
        }
        
        public void addForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
            foreignKeyConstraints.add(foreignKeyConstraint);
        }
    }
    
    public static class ColumnInfo {
        private final String columnName;
        private final String dataType;
        private final Integer maxLength;
        private final Integer precision;
        private final Integer scale;
        private final boolean nullable;
        private final String defaultValue;
        
        public ColumnInfo(String columnName, String dataType, Integer maxLength, 
                         Integer precision, Integer scale, boolean nullable, String defaultValue) {
            this.columnName = columnName;
            this.dataType = dataType;
            this.maxLength = maxLength;
            this.precision = precision;
            this.scale = scale;
            this.nullable = nullable;
            this.defaultValue = defaultValue;
        }
        
        // Getters
        public String getColumnName() { return columnName; }
        public String getDataType() { return dataType; }
        public Integer getMaxLength() { return maxLength; }
        public Integer getPrecision() { return precision; }
        public Integer getScale() { return scale; }
        public boolean isNullable() { return nullable; }
        public String getDefaultValue() { return defaultValue; }
    }
    
    public static class CheckConstraint {
        private final String constraintName;
        private final String checkClause;
        
        public CheckConstraint(String constraintName, String checkClause) {
            this.constraintName = constraintName;
            this.checkClause = checkClause;
        }
        
        public String getConstraintName() { return constraintName; }
        public String getCheckClause() { return checkClause; }
    }
    
    public static class UniqueConstraint {
        private final String constraintName;
        private final List<String> columns;
        
        public UniqueConstraint(String constraintName, List<String> columns) {
            this.constraintName = constraintName;
            this.columns = columns;
        }
        
        public String getConstraintName() { return constraintName; }
        public List<String> getColumns() { return columns; }
    }
    
    public static class PrimaryKeyConstraint {
        private final String constraintName;
        private final List<String> columns;
        
        public PrimaryKeyConstraint(String constraintName, List<String> columns) {
            this.constraintName = constraintName;
            this.columns = columns;
        }
        
        public String getConstraintName() { return constraintName; }
        public List<String> getColumns() { return columns; }
    }
    
    public static class ForeignKeyConstraint {
        private final String constraintName;
        private final String columnName;
        private final String referencedTable;
        private final String referencedColumn;
        
        public ForeignKeyConstraint(String constraintName, String columnName, 
                                  String referencedTable, String referencedColumn) {
            this.constraintName = constraintName;
            this.columnName = columnName;
            this.referencedTable = referencedTable;
            this.referencedColumn = referencedColumn;
        }
        
        public String getConstraintName() { return constraintName; }
        public String getColumnName() { return columnName; }
        public String getReferencedTable() { return referencedTable; }
        public String getReferencedColumn() { return referencedColumn; }
    }
}
