package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Message message = context.getBean("message", Message.class);
//        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
//        AdditionalInformationOuter outer = new AdditionalInformationOuterDateTimeImpl(renderer);

        AdditionalInformationOuter outer = context.getBean("outer", AdditionalInformationOuter.class);
        outer.withAdditionalInfo(message);
    }
}
