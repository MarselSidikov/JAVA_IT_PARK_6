package ru.itpark.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainCheckedExampleTryCatch {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Все пошло не по плану");
        }
    }
}
