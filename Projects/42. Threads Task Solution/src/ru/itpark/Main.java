package ru.itpark;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

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

        Counter threads[] = new Counter[threadsCount];


        int blocksSize = numbersCount / threadsCount;
        int from = 0;
        int to = blocksSize;
        for (int i = 0; i < threadsCount - 1; i++) {
            threads[i] = new Counter(from, to, arrayNumbers);
            from += blocksSize + 1;
            to += blocksSize + 1;
            threads[i].start();
        }
        threads[threadsCount - 1] = new Counter(from, numbersCount - 1, arrayNumbers);
        threads[threadsCount - 1].start();
        for (int i = 0; i < threadsCount; i++) {
            threads[i].join();
        }

        int sumOfThread = 0;
        for (int i = 0; i < threadsCount; i++) {
            sumOfThread += threads[i].getSumResult();
        }

        System.out.println("Сумма элементов из массива потоков = " + " " + sumOfThread);


    }
}