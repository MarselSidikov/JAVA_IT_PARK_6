package ru.itpark;

public class MainSimpleExecutorService {
    public static void main(String[] args) {
        SimpleExecutorService simpleExecutorService = new SimpleExecutorService();

        simpleExecutorService.submit(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Egg");
            }
        });

        simpleExecutorService.submit(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hen");
            }
        });
    }
}
