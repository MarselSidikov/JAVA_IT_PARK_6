package ru.itpark;

import java.util.Random;

public class MainStepMatrix {
    public static void main(String[] args) {
        int array[][] = new int[4][];
        Random random = new Random();
//        array[0] = new int[2];
//        array[1] = new int[4];
//        array[2] = new int[9];
//        array[3] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(10) + 1];
        }
    }
}
