package ru.itpark;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human(25, "Марсель", 1.85));
        humans.add(new Human(31, "Алмаз", 1.33));
        humans.add(new Human(29, "Артур", 1.96));
        humans.add(new Human(45, "Ильгам", 1.55));
        humans.add(new Human(91, "Азат", 2.02));
        humans.add(new Human(101, "Гульназ", 11.85));
        humans.add(new Human(35, "Гузель", 1.76));
        humans.add(new Human(66, "Мария", 1.76));

        Algorithms.sort(humans);

        humans.print();

        Comparator<Human> humanComparator = new ByAgeHumansComparator();

        Algorithms.sort(humans, humanComparator);

        System.out.println("-------");
        humans.print();

//        Scanner scanner = new Scanner("in.txt");
//        Scanner scanner1 = new Scanner("in.txt");
//        Scanner scanner2 = new Scanner("in.txt");
//        Scanner scanner3 = new Scanner("in.txt");
//
//        ArrayList<Scanner> scanners = new ArrayList<>();
//        scanners.add(scanner);
//        scanners.add(scanner1);
//        scanners.add(scanner2);
//        scanners.add(scanner3);
//
//        Algorithms.sort(scanners);
    }
}
