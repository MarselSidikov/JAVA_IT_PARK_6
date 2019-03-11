package ru.itpark;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AnotherCounter extends Thread {
    private int from;
    private int to;
    private int array[];
    private static final Lock lock = new ReentrantLock();

    public AnotherCounter(int from, int to, int[] array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            lock.lock();
            AnotherMain.sumResult += array[i];
            lock.unlock();
        }
    }
}
