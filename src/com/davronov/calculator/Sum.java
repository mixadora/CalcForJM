package com.davronov.calculator;

// Данный класс создан для сложения строков
public class Sum {
    // Метод проверяет находиться ли строки в двойных ковычек и содержить 10 символов, складывает строки
    // и возвращает готовый результат;
    public static String summation(String line1, String line2) {
        String result = null;
        for (int i = 0; i < line1.length(); i++) {
            if (line1.length() <= 12 && line1.startsWith("\"") && line1.endsWith("\"")
                        && line2.length() <= 12 && line2.startsWith("\"") && line2.endsWith("\"")) {
                result = line1.substring(0, line1.length() - 1) + line2.substring(1, line2.length());
                } else {
                    throw new NumberFormatException();
                }
            }
        return result;
    }
}