package ru.itpark.agregation;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(777, "Whroom whroom...");
        Engine engineForVaz = new Engine(666, "тырпыхпыхпых");
        Car bugatti = new Car("Bugatti", engine);
        Car kalina = new Car("Калина", engineForVaz);
        bugatti.start();
        kalina.start();
    }
}
