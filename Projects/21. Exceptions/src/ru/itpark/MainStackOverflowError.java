package ru.itpark;

public class MainStackOverflowError {
    public static int f(int n) {
        return n * f(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
