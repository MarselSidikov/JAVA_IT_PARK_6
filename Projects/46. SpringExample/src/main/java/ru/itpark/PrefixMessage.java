package ru.itpark;

public class PrefixMessage implements Message {
    private String text;
    private String prefix;

    public PrefixMessage(String prefix) {
        this.prefix = prefix;
        this.text = "";
    }

    @Override
    public String getText() {
        return prefix + " " + text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
