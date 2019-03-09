package ru.itpark;

public class SimpleExecutorService {
    public void submit(Runnable task) {
        Thread newThread = new Thread(task);
        newThread.start();
    }
}
