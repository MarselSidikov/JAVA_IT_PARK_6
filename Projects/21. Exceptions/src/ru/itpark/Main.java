package ru.itpark;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 5^ = 0 + 1 + 2 + 3 + 4 + 5

    // при stop = 3

    // 5^ = 0 + 4 + 5
    public static int f(int n, int stop) {
        if (n >= 0 && n <= stop) {
            return 0;
        }
        return n + f(n-1, stop);
    }

    // Вычисляем сумму чисел до заданной глубины
    // помещает вычисленные значения в массив под необходимым индексом
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isCorrectInput;

        do {
            try {
                int arraySize = scanner.nextInt();
                int stopCondition = scanner.nextInt();
                String lines[] = new String[arraySize];
                for (int i = 0; i < lines.length; i++) {
                    lines[i] = String.valueOf(f(i + 1, stopCondition));
                }
                System.out.println(Arrays.toString(lines));
                isCorrectInput = true;
            } catch (StackOverflowError e) {
                System.out.println("Глубина не может быть отрицательной");
                isCorrectInput = false;
            } catch (OutOfMemoryError e) {
                System.out.println("Слишком большой размер массива");
                isCorrectInput = false;
            } catch (Throwable e) {
                System.out.println("Ну что-то совсем не так");
                isCorrectInput =  false;
            }
        } while (!isCorrectInput);




    }
}
