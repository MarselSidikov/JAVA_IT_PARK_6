package ru.itpark;

public class Consumer extends Thread {
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isReady()) {
                    try {
                        System.out.println("Consumer waiting");
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
                System.out.println("Consumer consuming");
                product.consume();
                product.notify();
            }
        }
    }
}
