package ru.itpark;

import java.util.Scanner;

public class MainArithmeticException {

    public static int divFunction(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int divResult = divFunction(a ,b);

        System.out.println(divResult);
    }
}
