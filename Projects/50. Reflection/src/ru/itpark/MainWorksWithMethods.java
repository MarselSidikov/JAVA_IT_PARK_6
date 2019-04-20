package ru.itpark;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MainWorksWithMethods {
    public static void main(String[] args) throws Exception {
        Class<Human> aClass = Human.class;
        Method methods[] = aClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.print(method.getReturnType().getName() + " " + method.getName() + " ");
            for (Parameter parameter : method.getParameters()) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ",");
            }
            System.out.println();
        }

        Human human = new Human();
        human.name = "Марсель";
        human.changeSex();
        human.height = 1.85;

        Method growMethod = aClass.getMethod("grow", double.class);

        double newHeight = (double)growMethod.invoke(human, 400);
        System.out.println(newHeight);
        System.out.println(human.height);
    }
}
