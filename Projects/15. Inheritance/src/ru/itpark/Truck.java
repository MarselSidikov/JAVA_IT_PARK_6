package ru.itpark;

public class Truck extends Car {

    private static final double DEFAULT_CAPACITY = 10.0;

    protected double capacity;

    public Truck(String model, int speed, double capacity) {
        super(model, speed);


        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = DEFAULT_CAPACITY;
        }
    }

    public void load(double cargoCapacity) {
        if (this.capacity >= cargoCapacity) {
            this.capacity -= cargoCapacity;
        }
    }

    public double getLoadedCapacity() {
        return capacity;
    }
}
