package ru.itpark.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@ComponentScan("ru.itpark")
@PropertySource("classpath:ru.itpark.config\\db.properties")
public class AppConfig {
    @Autowired
    private Environment environment;

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
