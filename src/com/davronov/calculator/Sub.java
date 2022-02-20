package com.davronov.calculator;

//Данный класс создан для операции вычетании строков
class Sub {
    //Данный метод так же проверяет наличии двойных кавычек, состоит ли вторая строка внутри первой, выполняет операции
    //вычетании и возвращает готовый результат;
    public static String subtraction(String line1, String line2) {
        String result = null;
        if (line1.length() <= 12 && line1.startsWith("\"") && line1.endsWith("\"")
                    && line2.length() <= 12 && line2.startsWith("\"") && line2.endsWith("\"")) {
            if (line1.contains(line2.substring(1, line2.length() - 1)) && line1.length() > line2.length()) {
                int a = line1.length() - line2.length();
                result = line1.substring(0, a + 1) + "\"";
                } else {
                    result = line1;
                }
            } else {
                throw new NumberFormatException();
            }
        return result;
    }
}