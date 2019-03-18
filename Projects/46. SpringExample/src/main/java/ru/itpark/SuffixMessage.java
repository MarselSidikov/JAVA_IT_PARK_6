package ru.itpark;

public class SuffixMessage implements Message {
    private String suffix;
    private String text;

    public SuffixMessage(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text + " " + suffix;
    }
}
