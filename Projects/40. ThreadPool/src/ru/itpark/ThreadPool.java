package ru.itpark;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadPool {

    // количество рабочих потоков
    private final int threadsCount;

    // массив рабочих потоков
    private final ThreadWorker workers[];
    // очередь задач
    private final Deque<Runnable> tasks;

    public ThreadPool(int threadsCount) {
        this.threadsCount = threadsCount;
        // создаем очередь, которая может
        // работать с многопоточностью
        this.tasks = new ConcurrentLinkedDeque<>();
        // создаем массив ссылок на потоки
        this.workers = new ThreadWorker[threadsCount];
        // создаем каждый поток и запускаем его
        for (int i = 0; i < workers.length; i++) {
            this.workers[i] = new ThreadWorker();
            this.workers[i].start();
        }
    }

    // принимаем на вход задачу, которую
    // нужно выполнить в потоке
    public void submit(Runnable task) {
        // занимаем очередь
        synchronized (tasks) {
            // кладем в нее задачу
            tasks.add(task);
            // оповещаем все потоки, о том, что пришла новая задача,
            // но начнет работать только один
            tasks.notifyAll();
        }
    }
    // класс рабочего потока
    private class ThreadWorker extends Thread {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getName() + " started");
            Runnable task;
            // потоки работают бесконечно, поэтому мы не тратим время
            // на создание и завершение потоков
            while (true) {
                // занимаем очередь задач
                synchronized (tasks) {
                    // пока очередь пустая
                    while (tasks.isEmpty()) {
                        try {
                            // уходим на ней в ожидание
                            // пока в нее не положат новую задачу и не оповестят нас
                            tasks.wait();
                        } catch (InterruptedException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                }
                // берем задачу из потока
                task = tasks.removeFirst();
                // выполняем ее
                task.run();
            }
        }
    }

}
