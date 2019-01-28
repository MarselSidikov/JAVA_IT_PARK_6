package ru.itpark.checked.good;

import java.io.File;
import java.io.FileNotFoundException;

public class Files {
    public String getAbsolute(String fileName) {
        FileUtil fileUtil = new FileUtil();
        try {
            File file = fileUtil.openFile(fileName);
            return file.getAbsolutePath();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
