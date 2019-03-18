package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanScopes {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Message message = context.getBean("message", Message.class);
        System.out.println(message.getText());
        message.setText("Евгения");
        System.out.println(message.getText());
        Message message2 = context.getBean("message", Message.class);
        System.out.println(message2.getText());

    }
}
