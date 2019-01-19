package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Camry", 150);
        Truck truck = new Truck("Kamaz", 180, 12);
        SuperTruck superTruck = new SuperTruck("Белаз", 30, 60,0.9);
        car.go(100);
        truck.go(50);

        truck.load(5);
        superTruck.load(10);


        System.out.println(car.getKm());
        System.out.println(truck.getKm());
        System.out.println(truck.getLoadedCapacity());
        System.out.println(superTruck.getLoadedCapacity());
    }
}
