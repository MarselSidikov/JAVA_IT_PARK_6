package ru.itpark;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "Zaq12wsx";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/my_service";

    public static void main(String[] args) throws Exception {
        DataBaseConnector connector = new DataBaseConnector(DB_URL, DB_USER, DB_PASSWORD);
        ResultSet resultSet = connector.executeQuery("select * from service_user");

        while (resultSet.next()) {
            System.out.println(resultSet.getLong("id") + " " + resultSet.getString("first_name"));

        }


    }
}
