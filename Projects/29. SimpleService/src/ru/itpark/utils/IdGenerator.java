package ru.itpark.utils;

import java.io.*;

public class IdGenerator {
    private int lastGeneratedId;
    private String idSequenceFileName;

    public IdGenerator(String idSequenceFileName) {
        this.idSequenceFileName = idSequenceFileName;
        try {
            FileReader fileReader = new FileReader(idSequenceFileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String lastGeneratedIdAsString = reader.readLine();
            this.lastGeneratedId = Integer.parseInt(lastGeneratedIdAsString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int generateId() {
        try {
            FileWriter fileWriter = new FileWriter(idSequenceFileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int result = this.lastGeneratedId;
            this.lastGeneratedId++;
            writer.write(String.valueOf(this.lastGeneratedId));
            writer.close();
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
