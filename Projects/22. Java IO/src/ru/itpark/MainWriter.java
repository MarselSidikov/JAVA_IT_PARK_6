package ru.itpark;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class MainWriter {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("output_2.txt");
//        writer.write('Ф');
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
//        char textAsCharArray[] = text.toCharArray();
//        writer.write(textAsCharArray);
        writer.write(text);
        writer.close();
    }
}
