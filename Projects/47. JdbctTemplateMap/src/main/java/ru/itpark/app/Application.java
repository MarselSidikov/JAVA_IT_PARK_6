package ru.itpark.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itpark.repository.CoursesRepository;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CoursesRepository coursesRepository = context.getBean(CoursesRepository.class);
        System.out.println(coursesRepository.findAll());
    }
}
