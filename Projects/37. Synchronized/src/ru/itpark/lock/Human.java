package ru.itpark.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Human extends Thread {
    private final BonusCard bonusCard;

    private static final Lock lock = new ReentrantLock();

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
        lock.lock();
        if (bonusCard.getBonuses() >= bonusesCount) {
            System.out.println(who + " is gonna by something");
            if (bonusCard.use(bonusesCount, who)) {
                System.out.println(who + " bought something");
            } else {
                System.out.println("Sorry, Honey, no money");
            }
        }
        lock.unlock();

    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            shopping(7);
        }
    }

}
