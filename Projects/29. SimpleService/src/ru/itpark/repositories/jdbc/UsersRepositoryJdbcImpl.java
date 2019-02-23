package ru.itpark.repositories.jdbc;

import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersRepositoryJdbcImpl implements UsersRepository {

    //language=SQL
    private final static String SQL_SELECT_BY_ID = "select * from service_user where id = ";

    private DataBaseConnector connector;

    public UsersRepositoryJdbcImpl(DataBaseConnector connector) {
        this.connector = connector;
    }

    @Override
    public void save(User model) {
        //language=sql
        String insertQuery = "insert into service_user(first_name, last_name, login, password) " +
                "values ('" + model.getFirstName() + "','" + model.getLastName() + "','" + model.getLogin()
                + "','" + model.getPassword() + "');";

        System.out.println("RUN QUERY: " + insertQuery);

        if (!connector.executeUpdate(insertQuery)) {
            throw new IllegalStateException("Some error");
        }
    }

    @Override
    public User find(Long id) {
        ResultSet result = connector.executeQuery(SQL_SELECT_BY_ID + id + ";");
        try {
            if (result.next()) {
                return new User(result.getLong("id"),
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("login"),
                        result.getString("password"));
            } else return null;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
