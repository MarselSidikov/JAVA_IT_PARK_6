package ru.itpark.repositories.files;

import java.io.*;

public class IdGenerator {
    private Long lastGeneratedId;
    private String idSequenceFileName;

    public IdGenerator(String idSequenceFileName) {
        this.idSequenceFileName = idSequenceFileName;
        try {
            FileReader fileReader = new FileReader(idSequenceFileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String lastGeneratedIdAsString = reader.readLine();
            this.lastGeneratedId = Long.parseLong(lastGeneratedIdAsString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long generateId() {
        try {
            FileWriter fileWriter = new FileWriter(idSequenceFileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            Long result = this.lastGeneratedId;
            this.lastGeneratedId++;
            writer.write(String.valueOf(this.lastGeneratedId));
            writer.close();
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
