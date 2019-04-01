package ru.itpark.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import ru.itpark.repositories.AuthRepository;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.jdbc.AuthRepositoryJdbcTemplateImpl;
import ru.itpark.repositories.jdbc.UsersRepositoryJdbcTemplateImpl;
import ru.itpark.services.AuthService;
import ru.itpark.services.AuthServiceImpl;
import ru.itpark.services.UsersService;
import ru.itpark.services.UsersServiceImpl;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:ru.itpark.config\\db.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("db.url"));
        dataSource.setPassword(environment.getProperty("db.password"));
        dataSource.setUsername(environment.getProperty("db.username"));
        dataSource.setDriverClassName(environment.getProperty("db.driver"));
        return dataSource;
    }
}
