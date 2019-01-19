package ru.itpark;

public class SuperTruck extends Truck {
    private double loadFactor;

    public SuperTruck(String model, int speed, double capacity, double loadFactor) {
        super(model, speed, capacity);
        this.loadFactor = loadFactor;
    }

    public void load(double cargoCapacity) {
        cargoCapacity = cargoCapacity * loadFactor;
        if (this.capacity >= cargoCapacity) {
            this.capacity -= cargoCapacity;
        }
    }

    public void go(int km) {
        this.km += km * loadFactor;
    }

}
