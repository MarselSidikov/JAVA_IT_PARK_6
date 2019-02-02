package ru.itpark;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainInputStreamExtended {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input.txt");
        byte bytes[] = new byte[15];
        int result = inputStream.read(bytes);
        System.out.println(result);
        System.out.println(Arrays.toString(bytes));

        String fromFile = new String(bytes);
        System.out.println(fromFile);
    }

}
