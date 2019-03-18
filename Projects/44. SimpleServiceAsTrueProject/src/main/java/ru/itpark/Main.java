package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.jdbc.UsersRepositoryJdbcTemplateImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UsersRepository usersRepository = context.getBean(UsersRepository.class);

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
