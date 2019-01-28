package ru.itpark.checked.bad;

import java.io.File;
import java.io.FileNotFoundException;

public class FileUtil {
    public File openFile(String fileName) throws FileNotFoundException {
        if (fileName.startsWith("input_")) {
            return new File(fileName);
        } else {
            throw new FileNotFoundException();
        }
    }
}
