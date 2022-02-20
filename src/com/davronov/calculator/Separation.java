package com.davronov.calculator;

public class Separation {
    //Данный метод находит знаки операции и исходя из полученного, находит строки или число
    public static String[] sep(String input) {
        String[] linesInput = new String[3];
        for (int i = 0; i < input.length(); i++) {
            OUTER:
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                linesInput[0] = input.substring(0, i);
                linesInput[1] = input.substring(i, i + 1);
                linesInput[2] = input.substring(i + 1);
                // Проверка дает возможность калькулятору определять строков игнорируя пробелов около знака операции
                INNER:
                    if (input.charAt(i - 1) == ' ') {
                        linesInput[0] = input.substring(0, i - 1);
                    } else {
                        linesInput[0] = input.substring(0, i);
                    }
                    if (input.charAt(i + 1) == ' ') {
                        linesInput[2] = input.substring(i + 2);
                    } else {
                        linesInput[2] = input.substring(i + 1);
                    }
                }
            }
        return linesInput;
    }
}