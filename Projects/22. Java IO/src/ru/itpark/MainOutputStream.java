package ru.itpark;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainOutputStream {
    public static void main(String[] args) throws Exception {
        OutputStream output = new FileOutputStream("output.txt", true);
        output.write('B');
        output.write('Ф');
    }
}
