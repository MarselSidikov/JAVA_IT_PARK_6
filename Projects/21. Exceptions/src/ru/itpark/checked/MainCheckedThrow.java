package ru.itpark.checked;

import java.io.File;
import java.io.FileNotFoundException;

public class MainCheckedThrow {
    public static File openFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("input.txt")) {
            return new File(fileName);
        } else {
            throw new FileNotFoundException();
        }
    }
    public static void main(String[] args) {
        try {
            File file = openFile("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Все плохо");
        }
    }
}
