package ru.itpark.synchronize;

public class BonusCard {

    private int bonuses;

    public BonusCard(int bonuses) {
        this.bonuses = bonuses;
    }

    public int getBonuses() {
        return bonuses;
    }

    public boolean use(int bonusesCount, String who) {
        if (bonuses >= bonusesCount) {
            bonuses -= bonusesCount;
            System.out.println(who + " " + bonuses + " left.");
            return true;
        } else {
            System.out.println("OOPS");
            return false;
        }
    }
}
