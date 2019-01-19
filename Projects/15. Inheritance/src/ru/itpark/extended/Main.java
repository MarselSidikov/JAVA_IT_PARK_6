package ru.itpark.extended;

import ru.itpark.Car;
import ru.itpark.SuperTruck;
import ru.itpark.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Camry", 12);
        Car car2 = new Truck("Kamaz", 150, 12);
        Car car3 = new SuperTruck("BelAZ", 20, 60, 0.9);

        Car cars[] = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].go(20);
        }

        System.out.println(car1.getKm());
        System.out.println(car2.getKm());
        System.out.println(car3.getKm());

    }
}
