package ru.itpark;

public class MainClassInfo {
    public static void main(String[] args) throws Exception {
//        Class aClass = Human.class;
//        Human human = (Human)aClass.newInstance();
        Class<Human> aClass = Human.class;
        Human human = aClass.newInstance();
        System.out.println(human.height);
    }
}
