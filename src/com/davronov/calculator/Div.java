package com.davronov.calculator;

//Данный класс создан для разделения строка;
public class Div {
    // Метод проверяет первую строку наличии двойных кавычек, находиться ли число в интервале [1-9], выолняет оперции,
    // и возвращает готовый результат;
    public static String division(String line1, String line2, boolean isNum) {
        String result = null;
        if (isNum && line1.length() <= 12 && line1.startsWith("\"") && line1.endsWith("\"")
                    && Integer.parseInt(line2) >= 1 && Integer.parseInt(line2) <= 10) {
            int div = line1.substring(1, line1.length() - 2).length() / Integer.parseInt(line2);
            if (Integer.parseInt(line2) == 1) {
                result = line1;
            } else {
                result = line1.substring(0, div + 1) + "\"";
            }
            } else {
                throw new NumberFormatException();
            }
        return result;
    }
}