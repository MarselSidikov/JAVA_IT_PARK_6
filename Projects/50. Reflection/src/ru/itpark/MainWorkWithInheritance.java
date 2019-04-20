package ru.itpark;

import java.io.File;
import java.io.FileInputStream;

public class MainWorkWithInheritance {
    public static void main(String[] args) {
        Class<FileInputStream> aClass = FileInputStream.class;
        Class<?> superClass = aClass.getSuperclass();
        System.out.println(superClass.getName());
    }
}
