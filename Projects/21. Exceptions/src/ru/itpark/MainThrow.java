package ru.itpark;

import ru.itpark.custom.PasswordLengthException;

import java.util.Scanner;

public class MainThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() >= 7) {
            System.out.println("Все хорошо");
        } else {
            // throw new IllegalArgumentException("Некорректный пароль");
            throw new PasswordLengthException();
        }

        System.out.println("Пароль сохранен");
        // ...
    }
}
