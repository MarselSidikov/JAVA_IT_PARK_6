package ru.itis;

public class ProgramDemo {
    public static void main(String[] args) {
        Human igor;
        igor = new Human(28, true);

        Human marsel = new Human(24, true);

        Human vlad = marsel;
        vlad.age = 26;
        System.out.println(marsel.age);

        marsel.go(15);
        marsel.go(5);
        igor.go(10);
        System.out.println(marsel.km);

        Human evgeniia = new Human();
        System.out.println(evgeniia.km);
    }
}
