package ru.itpark;

import sun.nio.ch.SelectorImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingletonLogger {

    private static final SingletonLogger instance;


    private SingletonLogger() {

    }

    static {
        instance = new SingletonLogger();
    }

    public static SingletonLogger getLogger() {
        return instance;
    }

    private String filePath;
    private String loggerName;

    public void setProperties(String loggerName, String filePath) {
        this.loggerName = loggerName;
        this.filePath = filePath;
    }

    public void log(String message) {
        System.out.println(loggerName + " " + LocalDateTime.now() + " wrote [" + message + "] to <" + filePath + ">");
    }
}
