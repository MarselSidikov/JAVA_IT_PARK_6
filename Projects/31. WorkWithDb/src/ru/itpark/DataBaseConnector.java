package ru.itpark;

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

    public ResultSet executeQuery(String sql) {
        Statement statement = createStatement();
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
