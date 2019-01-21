package ru.itpark;

public class Main {
    public static void main(String[] args) {
//        SingletonLogger logger = new SingletonLogger();

        SingletonLogger logger = SingletonLogger.getLogger();
        SingletonLogger logger1 = SingletonLogger.getLogger();

        logger1.setProperties("AnotherLogger", "logger.log");
        logger.setProperties("SimpleLogger", "logger.log");

        logger.log("Hello from main");
        logger1.log("Hello from main");


    }
}
