package ru.itpark;

public class Product {
    private boolean status = false;

    // готовность продукта
    public boolean isReady() {
        return status;
    }

    // был ли он использован
    // если продукт готов - то он не использовался
    // если продукт не готов - то он использован
    public boolean isConsumed() {
        return !status;
    }

    public void produce() {
        this.status = true;
    }

    public void consume() {
        this.status = false;
    }

}
