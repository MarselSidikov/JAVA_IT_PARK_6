package ru.itpark.repositories.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import ru.itpark.models.Auth;
import ru.itpark.repositories.AuthRepository;

import java.util.List;

public class AuthRepositoryImpl implements AuthRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into auth (user_id, cookie_value) values (?, ?)";

    private JdbcTemplate template;

    public AuthRepositoryImpl(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void save(Auth model) {
        template.update(SQL_INSERT, model.getUser().getId(), model.getValue());
    }

    @Override
    public Auth find(Long id) {
        return null;
    }

    @Override
    public List<Auth> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
