package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class AnotherMain {
    public static int sumResult = 0;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        int sumOfArray = 0;

        int arrayNumbers[] = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            arrayNumbers[i] = random.nextInt(1000);
            sumOfArray += arrayNumbers[i];
        }

        System.out.println("Сумма чисел в массиве = " + " " + sumOfArray);

        AnotherCounter threads[] = new AnotherCounter[threadsCount];


        int blocksSize = numbersCount / threadsCount;
        int from = 0;
        int to = blocksSize;
        for (int i = 0; i < threadsCount - 1; i++) {
            threads[i] = new AnotherCounter(from, to, arrayNumbers);
            from += blocksSize + 1;
            to += blocksSize + 1;
            threads[i].start();
        }
        threads[threadsCount - 1] = new AnotherCounter(from, numbersCount - 1, arrayNumbers);
        threads[threadsCount - 1].start();
        for (int i = 0; i < threadsCount; i++) {
            threads[i].join();
        }

        System.out.println("Сумма элементов из массива потоков = " + " " + sumResult);


    }
}
