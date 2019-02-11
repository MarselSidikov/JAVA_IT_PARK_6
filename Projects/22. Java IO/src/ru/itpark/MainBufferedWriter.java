package ru.itpark;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainBufferedWriter {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_3.txt"));
        writer.newLine();
        writer.write("Привет!");
        writer.newLine();
        writer.close();
    }
}
