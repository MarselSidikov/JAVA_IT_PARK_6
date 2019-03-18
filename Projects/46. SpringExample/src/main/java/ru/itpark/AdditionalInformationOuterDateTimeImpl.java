package ru.itpark;

import java.time.LocalDateTime;

public class AdditionalInformationOuterDateTimeImpl implements AdditionalInformationOuter {

    private MessageRenderer renderer;

    public AdditionalInformationOuterDateTimeImpl(MessageRenderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void withAdditionalInfo(Message message) {
        System.out.print("At " + LocalDateTime.now() + " was: ");
        renderer.printMessage(message);

    }
}
