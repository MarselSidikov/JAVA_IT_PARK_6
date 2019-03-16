package ru.itpark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.jdbc.UsersRepositoryJdbcTemplateImpl;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Zaq12wsx");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/my_service");

        UsersRepository usersRepository
                = new UsersRepositoryJdbcTemplateImpl(dataSource);

        User user = User.builder()
                .firstName("Муса")
                .lastName("Джалил")
                .login("musa777")
                .password("хаерле ирте")
                .build();

        System.out.println(usersRepository.findAll());
        System.out.println(usersRepository.findOneByLogin("victorq"));
        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков"));
        usersRepository.save(user);

    }
}
