package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Runnable egg = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Egg");
            }
        };

        Runnable hen = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hen");
            }
        };

        Thread t1 = new Thread(egg);
        Thread t2 = new Thread(hen);

        t1.start();
        t2.start();
    }
}
