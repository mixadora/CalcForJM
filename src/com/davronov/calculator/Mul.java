package com.davronov.calculator;
//Данный класс создан для умножения строка на несколько раз;
public class Mul {
    // Метод проверяет первую строку наличии двойных кавычек, находиться ли число в интервале [1-9], выолняет оперции,
    // если результать более 40 символов добавит в конце (...) и возвращает готовый результат;
    public static String multiplication(String line1, String line2, boolean isNum) {
        String result = null;
        if (isNum && line1.length() <= 12 && line1.startsWith("\"") && line1.endsWith("\"")
                    && Integer.parseInt(line2) >= 1 && Integer.parseInt(line2) <= 10) {
            result = line1.substring(1, line1.length() - 1);
            for (int i = 0; i < Integer.parseInt(line2) - 1; i++) {
                result = result + line1.substring(1, line1.length() - 1);
            }
            } else {
                throw new NumberFormatException();
            }
            if (result.length() > 40) {
                result = "\"" + result.substring(0, 37) + "...\"";
            } else {
                result = "\"" + result + "\"";
            }
            return result;
    }
}