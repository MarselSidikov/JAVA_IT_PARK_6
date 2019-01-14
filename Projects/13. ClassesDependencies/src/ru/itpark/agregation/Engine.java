package ru.itpark.agregation;

public class Engine {
    private int number;
    private String whroomWhroomSound;

    public Engine(int number, String whroomWhroomSound) {
        this.number = number;
        this.whroomWhroomSound = whroomWhroomSound;
    }

    public void whroomWhroom() {
        System.out.println(whroomWhroomSound);
    }
}
