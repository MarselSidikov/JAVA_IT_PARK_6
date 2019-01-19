package ru.itpark;

public class Car {

    private static final int DEFAULT_KM = 0;
    private static final int MIN_SPEED = 1;

    private String model;
    protected int km;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.km = DEFAULT_KM;

        if (speed >= MIN_SPEED) {
            this.speed = speed;
        } else {
            this.speed = MIN_SPEED;
        }
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public int getSpeed() {
        return speed;
    }

    public void go(int km) {
        this.km += km;
    }
}
