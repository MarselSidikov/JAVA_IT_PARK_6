package ru.itpark.checked.bad;

import java.io.File;
import java.io.FileNotFoundException;

public class Files {
    public String getAbsolute(String fileName) throws FileNotFoundException {
        FileUtil fileUtil = new FileUtil();
        File file = fileUtil.openFile(fileName);
        return file.getAbsolutePath();
    }
}
