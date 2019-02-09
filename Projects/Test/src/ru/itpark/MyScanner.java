package ru.itpark;

//  Реализовать класс MyScanner через InputStream и FileInputStream:

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.Thread.sleep;

class MyScanner {
    private static String textOfMessage;
    private String fileName;
    private InputStream input;
    public static final int MAX_COUNTER_OF_INPUT_NUMBER = 100;

    public MyScanner(String fileName) {
        this.fileName = fileName;
        try {
            input = new FileInputStream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean specialSimbol(Integer currentSimbolCode) {
        if  (currentSimbolCode == 32)      //  пробел
            return true;
        else
            if ((currentSimbolCode >= 0)&&(currentSimbolCode <= 13))
                return true;
            else
                return false;
    }

    private boolean spaceSimbol(Integer currentSimbolCode) {
        if (currentSimbolCode == 32)
            return true;
        else
            return false;
    }

    private boolean digitSimbol(Integer currentSimbolCode) {
        if ((currentSimbolCode >= '0')&&(currentSimbolCode <= '9'))
            return true;
        else
            return false;
    }

    private boolean signSimbol(Integer currentSimbolCode) {
        if (currentSimbolCode == 45)   //  Символ  "-"
            return true;
        else
            return false;
    }

    public int nextInt() throws IOException {
        Boolean sign = false;
        String digits = "";
        Integer number = null;
        Integer currentSimbol;
        int currentSimbolCode = input.read();

        while (currentSimbolCode != -1) {
            while (specialSimbol(currentSimbolCode)) {    // Пропускаем все спецсимволы (пробел, перевод строки, возврат каретки и т.п.)
                currentSimbolCode = input.read();
            }
            if (signSimbol(currentSimbolCode)) {         // Проверяем, есть ли знак "-" перед числом. Если это "-", sign присваиваем true и считываем новый символ
                sign = true;
                currentSimbolCode = input.read();
            }
            if (digitSimbol(currentSimbolCode)) {       // Проверяем, является ли цифрой первый символ, отличный от пробелов,спецсимволов и "-"
                while (digitSimbol(currentSimbolCode)) {   //  Если нам встретилась цифра, продолжаем считывать другие цифры и формируем из них строку сцеплением
                    currentSimbol = currentSimbolCode - '0';
                    digits = digits + currentSimbol.toString();
                    currentSimbolCode = input.read();
                }
                if ((currentSimbolCode == -1)||(spaceSimbol(currentSimbolCode)))
                    if (digits != "") {
                        if (sign) digits = '-' + digits;
                        number = Integer.valueOf(digits);
                        return number;
                    }
            }
            else break;
        }
        return number;
    }

    public void printNumbers (int n, Integer[] array, String textOfMessage) {
        textOfMessage = textOfMessage + " : ";
        for (int i = 0; i < n; i++)
            textOfMessage = textOfMessage + array[i] + " ";
        System.out.println(textOfMessage);
    }

    public Integer[] scanFile(String filename, MyScanner myscanner)throws NumberFormatException, NullPointerException, IOException {
        Integer[] inputNumber = new Integer[MAX_COUNTER_OF_INPUT_NUMBER];
        textOfMessage = "Файл "+filename;
        int cntNumber = 0;
        if (myscanner.input != null) {
            if  (myscanner.input.available() != 0) {
                Integer nextnumber;
                while (myscanner.input.available() != 0) {
                    try {
                        nextnumber = myscanner.nextInt();
                    } catch (NumberFormatException e) {
                        textOfMessage = textOfMessage + " содержит числовые данные недопустимого формата";
                        throw new NumberFormatException(textOfMessage);
                    } catch (NullPointerException e) {
                        textOfMessage = textOfMessage + " содержит данные, не являющиеся целыми числами.";
                        throw new NullPointerException(textOfMessage);
                    }

                    if (nextnumber != null) {
                        inputNumber[cntNumber] = nextnumber;
                        cntNumber++;
                    }
                }
                printNumbers(cntNumber,inputNumber,textOfMessage);
            }
            else {
                textOfMessage = textOfMessage + " пуст.";
                throw new NullPointerException(textOfMessage);
            }
        }
        return inputNumber;
    }


}
