package ru.itpark;

public class MainNullPointerException {
    public static void main(String[] args) {
        // объявили массив объектных переменных,
        // каждая из которых ссылается на null
        String lines[] = new String[5];
        lines[1] = "Hello";
        System.out.println(lines[1].toUpperCase());
        System.out.println(lines[0].toUpperCase());

    }
}
