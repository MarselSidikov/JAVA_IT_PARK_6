package ru.itpark;

public class MessageRendererStandardImpl implements MessageRenderer {

    @Override
    public void printMessage(Message message) {
        System.out.println(message.getText());
    }
}
