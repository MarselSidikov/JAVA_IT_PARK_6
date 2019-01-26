package ru.itpark;

public class MainOutOfMemory {
    public static void main(String[] args) {
        String lines[] = new String[Integer.MAX_VALUE - 100];
    }
}
