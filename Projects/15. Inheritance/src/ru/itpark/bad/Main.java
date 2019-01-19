package ru.itpark.bad;

public class Main {
    public static void main(String[] args) {
        SberbankATM sberbankATM = new SberbankATM(200);
        System.out.println(sberbankATM.giveMoneyToClient(100));

        System.out.println(sberbankATM.giveMoney(20));
        System.out.println(sberbankATM.giveAllMoney());
    }
}
