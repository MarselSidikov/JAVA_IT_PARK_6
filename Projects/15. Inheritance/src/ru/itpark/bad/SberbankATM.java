package ru.itpark.bad;

public class SberbankATM extends ATM {

    public SberbankATM(double sum) {
        super(sum);
    }

    public double giveMoneyToClient(double sum) {
        double tempSum = giveMoney(sum);
        return tempSum * 0.9;
    }
}
