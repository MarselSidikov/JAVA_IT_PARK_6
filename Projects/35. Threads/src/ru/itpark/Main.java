package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {
        Hen hen = new Hen();
        Egg egg = new Egg();

        hen.start();
        egg.start();

//        hen.join();
        egg.join();

        for (int i = 0; i < 100; i++) {
            System.out.println("Человек!");
        }
    }
}
