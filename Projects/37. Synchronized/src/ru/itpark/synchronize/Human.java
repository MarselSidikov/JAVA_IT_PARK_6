package ru.itpark.synchronize;

public class Human extends Thread {
    private final BonusCard bonusCard;
    private static final Object mutex = new Object();
    private String who;

    public Human(BonusCard bonusCard, String who) {
        this.bonusCard = bonusCard;
        this.who = who;
    }

    public void shopping(int bonusesCount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
//        synchronized (bonusCard) {
        synchronized (mutex) {
            if (bonusCard.getBonuses() >= bonusesCount) {
                System.out.println(who + " is gonna by something");
                if (bonusCard.use(bonusesCount, who)) {
                    System.out.println(who + " bought something");
                } else {
                    System.out.println("Sorry, Honey, no money");
                }
            }
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            shopping(7);
        }
    }

}
