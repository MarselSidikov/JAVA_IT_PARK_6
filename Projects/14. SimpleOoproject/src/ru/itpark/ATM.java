package ru.itpark;

public class ATM {
    private int totalSum;

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int giveMoney(Card card, int pin, int sum) {
        if (card.equals(pin)) {
            if (totalSum > sum) {
                totalSum -= sum;
                return sum;
            } else {
                System.err.println("Денег нет, но вы держитесь");
                return -1;
            }
        } else {
            System.err.println("Пин код неверен");
            return -1;
        }
    }
}
