package ru.itpark;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String filename;
        final int MAX_COUNTER_OF_INPUT_NUMBER = 100;
        for (int i = 1; i < 9; i++) {
            filename = "Z:\\Students\\JAVA_IT_PARK_6\\BULYGINA_JAVA\\Tasks\\input"+i+".txt";
            try {
                MyScanner myscanner = new MyScanner(filename);
                Integer[] inputNumber = new Integer[MAX_COUNTER_OF_INPUT_NUMBER];
                inputNumber = myscanner.scanFile(filename,myscanner);
                sleep(700);
            }   catch (NumberFormatException | NullPointerException | IOException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }
}
