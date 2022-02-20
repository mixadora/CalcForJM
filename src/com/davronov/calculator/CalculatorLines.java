package com.davronov.calculator;

import java.util.Scanner;

public class CalculatorLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение в виде:" + "\n\"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b");
        String input = scan.nextLine();
        // Считываем строку полностью;
        while (!input.isEmpty()) {
            String[] linesInput = Separation.sep(input);
            String operation = linesInput[1];
            String line1 = linesInput[0];
            String line2 = linesInput[2];
            // из класса Separation получаем три строки: 1- до знака операции; 2- знак операции; 3- строка после знака.
            if (operation.equals("+")) {
                System.out.println("Ответ: " + Sum.summation(line1, line2));
            } else if (operation.equals("-")) {
                System.out.println("Ответ: " + Sub.subtraction(line1, line2));
            } else if (operation.equals("*")) {
                System.out.println("Ответ: " + Mul.multiplication(line1, line2, isNumeric(line2)));
            } else if (operation.equals("/")) {
                System.out.println("Ответ: " + Div.division(line1, line2, isNumeric(line2)));
            }
// Сравниваем знаки операции и при совпадении обращаемся к соответствующему классу с методом, для получения результата;
            System.out.println("----------------------------------------------");
            System.out.println("Введите следующее выражение: ");
            input = scan.nextLine();
            // После вывода ответа в консоль, можно заново вводить строки. Калькулятор продолжает работать;
        }
        System.out.println("Вы вышли из калькулятора");
        //  Если строка пуста, калькулятор заверщает свою работу;
    }
// Метод возвращает true если строка является целое число, если нет то false
    public static boolean isNumeric(String line2) {
        try {
            Integer.parseInt(line2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}





