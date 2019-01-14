package ru.itpark;

public class MainWorkWithKm {
    public static void main(String[] args) {
        Human marsel = new Human("Марсель", 24);
        System.out.println(marsel.getKm());
        marsel.go(15);
        marsel.go(20);
        System.out.println(marsel.getKm());
    }
}
