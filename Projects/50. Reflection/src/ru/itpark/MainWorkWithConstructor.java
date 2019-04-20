package ru.itpark;

import java.lang.reflect.Constructor;

public class MainWorkWithConstructor {
    public static void main(String[] args) throws Exception {
        Class<Human> aClass = Human.class;
//        Constructor constructor = aClass.getConstructor(double.class);
//        Human human = (Human)constructor.newInstance(15);
        Constructor<Human> constructor = aClass.getConstructor(double.class);
        Human human = constructor.newInstance(15);
        human = constructor.newInstance(20);
        System.out.println(human.height);


    }
}
