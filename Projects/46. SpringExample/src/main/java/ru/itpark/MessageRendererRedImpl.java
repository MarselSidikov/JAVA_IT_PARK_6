package ru.itpark;

public class MessageRendererRedImpl implements MessageRenderer {

    @Override
    public void printMessage(Message message) {
        System.err.println(message.getText());
    }
}
