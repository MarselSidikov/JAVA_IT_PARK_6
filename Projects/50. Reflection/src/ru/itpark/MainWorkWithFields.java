package ru.itpark;

import java.lang.reflect.Field;

public class MainWorkWithFields {
    public static void main(String[] args) throws Exception {
        Class<Human> aClass = Human.class;
//        Field fields[] = aClass.getFields();
        Field fields[] = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }

        Field nameField = aClass.getField("name");
        Human human = new Human();
        nameField.set(human, "Марсель");
        System.out.println(human.name);

        Field isManField = aClass.getDeclaredField("isMan");
        isManField.setAccessible(true);
        isManField.set(human, false);
        System.out.println(human.isMan());
    }
}
