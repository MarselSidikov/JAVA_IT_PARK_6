package ru.itpark;

public class Card {
    private String bankName;
    private int pin;
    private Human owner;
    private int cardNumber;

    public Card(String bankName, int pin, Human owner, int cardNumber) {
        this.bankName = bankName;
        this.pin = pin;
        this.owner = owner;
        this.cardNumber = cardNumber;
    }

    public boolean equals(int pin) {
        return this.pin == pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
