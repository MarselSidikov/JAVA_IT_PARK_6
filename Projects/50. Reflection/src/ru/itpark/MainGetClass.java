package ru.itpark;

public class MainGetClass {

    public static void main(String[] args) throws Exception {
        Class humanClass1 = Class.forName("ru.itpark.Human");
        Class humanClass2 = Human.class;
        Class<Human> humanClass3 = Human.class;
        Class<Human> humanClass4 = (Class<Human>)Class.forName("ru.itpark.Human");
        System.out.println(humanClass1);
        System.out.println(humanClass2);
    }
}
