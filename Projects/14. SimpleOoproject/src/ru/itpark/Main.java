package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Human marsel = new Human("Марсель");

        Card alfa = new Card("АльфаБанк", 7777, marsel, 12345);
        Card sber = new Card("СберБанк", 6666, marsel, 678910);

        marsel.addCard(alfa);
        marsel.addCard(sber);

        ATM atm = new ATM();
        atm.setTotalSum(100);

        marsel.takeCash(atm, 12345, 7777, 150);
        System.out.println(marsel.getCash());
        System.out.println(atm.getTotalSum());
    }
}
