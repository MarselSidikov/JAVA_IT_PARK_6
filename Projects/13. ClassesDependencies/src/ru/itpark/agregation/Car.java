package ru.itpark.agregation;

public class Car {
    private String model;

    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        this.engine.whroomWhroom();
    }
}
