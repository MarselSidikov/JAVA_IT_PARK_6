package ru.itpark;

public class Counter extends Thread {

    private int from;
    private int to;
    private int array[];
    private int sumResult;


    public Counter(int from, int to, int[] array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override

    public void run() {
        for (int i = from; i <= to; i++) {
            sumResult += array[i];
        }
    }

    public int getSumResult() {
        return sumResult;
    }
}