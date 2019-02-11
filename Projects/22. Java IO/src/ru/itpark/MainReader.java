package ru.itpark;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class MainReader {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("input_2.txt");
//        char letter = (char)reader.read();
//        System.out.println(letter);
        char text[] = new char[100];
        int length = reader.read(text);
        System.out.println(Arrays.toString(text));
        String textAsString = new String(text);
        System.out.println(textAsString);
    }
}
