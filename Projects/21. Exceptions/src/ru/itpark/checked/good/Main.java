package ru.itpark.checked.good;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Files files = new Files();
        System.out.println(files.getAbsolute("input_1.txt"));
        System.out.println(files.getAbsolute("input_2.txt"));
        System.out.println(files.getAbsolute("output_1.txt"));
    }
}
