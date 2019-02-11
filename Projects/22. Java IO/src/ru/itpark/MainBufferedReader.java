package ru.itpark;

import sun.java2d.pipe.AATileGenerator;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainBufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input_3.txt"));
        String name = reader.readLine();
        String surname = reader.readLine();
        String age = reader.readLine();
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }
}
