package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru.itpark.config/context.xml");
        UsersRepository usersRepository = context.getBean(UsersRepository.class);

        User user = User.builder()
                .firstName("Муса")
                .lastName("Джалил")
                .login("musa777")
                .passwordHash("хаерле ирте")
                .build();

        System.out.println(usersRepository.findAll());
        System.out.println(usersRepository.findOneByLogin("victorq"));
        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков"));
        usersRepository.save(user);

    }
}
