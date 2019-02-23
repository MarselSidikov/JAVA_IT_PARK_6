package ru.itpark.repositories.jdbc;

import java.sql.*;

public class DataBaseConnector {

    private Connection connection;

    public DataBaseConnector(String url, String user, String password) {
        this.connection = getConnection(url, user, password);
    }

    private Connection getConnection(String url, String user, String password) {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    private Statement createStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean executeUpdate(String sql) {
        Statement statement = createStatement();
        int rowsAffected = 0;
        try {
            rowsAffected = statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
        return rowsAffected == 1;
    }

    public ResultSet executeQuery(String sql) {
        Statement statement = createStatement();
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
