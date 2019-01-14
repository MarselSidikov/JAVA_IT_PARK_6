package ru.itpark;

import java.util.Random;

public class MainWorkWithAges {

    public static void main(String[] args) {
        String names[] = {"h1",
                "h2","h3","h4",
                "h5","h6","h7", "h8"};
        Random random = new Random();

        Human humans[] = new Human[1000];

        for (int i = 0; i < humans.length; i++) {
            String randomName = names[random.nextInt(8)];
            humans[i] = new Human(randomName, random.nextInt(100));
        }

//        for (int i = 0; i < humans.length; i++) {
//            System.out.println(humans[i].name + " " + humans[i].age);
//        }

        int ages[] = new int[100];

//        Human human = humans[273];
//        human.age = -10;

        humans[273] = new Human("Марсель", -10);

        for (int i = 0; i < humans.length; i++) {
//            ages[humans[i].age]++;
            ages[humans[i].getAge()]++;
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println(i + " " + ages[i]);
        }
    }
}
