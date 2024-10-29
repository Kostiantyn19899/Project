package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите операцию +, -, *, /, %");
        char operation = scanner.next().charAt(0);
        while (isNotValidOperation(operation)) {
            System.out.println("Операция не поддерживается. Введите еще раз");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    private static boolean isNotValidOperation(char operation) {
        return operation != Const.PLUS && operation != Const.MINUS && operation != Const.MULTIPLY && operation != Const.DIVIDE && operation != Const.REST;
    }



    public static boolean isDivisionByZero( double [] arrNum) {
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] == 0){
                return true;
            }
        }
        return false;
    }

    public static double getNum(char operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = scanner.nextDouble();
        while (operation == Const.DIVIDE && num == 0) {
           System.out.println("Деление на ноль запрещено. Попробуйте ввести новое значение");
            num = scanner.nextDouble();
        }
        return num;
    }

    public static double getResult(char[] operations, double[] arrNumbers) {
        double result = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            double argument = arrNumbers[i];


            switch (operations[i-1]) {
                case Const.PLUS:
                    result = result + argument;
                    break;
                case Const.MINUS:
                    result = result - argument;
                    break;
                case Const.MULTIPLY:
                    result = result * argument;
                    break;
                case Const.DIVIDE:
                    if (Utils.isDivisionByZero(arrNumbers)){
                        System.out.println("Деление на ноль запрещено");
                    }else {
                        result = result / argument;
                    }
                    break;
                case Const.REST:
                    result = result % argument;
                    break;
            }
        }


        return result;
    }

    public static String printResult(char[] operation, double [] arrNum, double result) {
        StringBuilder sb = new StringBuilder();
        if (!Utils.isDivisionByZero(arrNum)){

            for (int i = 0; i < arrNum.length; i++) {
                sb.append(arrNum[i]);
                if (i<arrNum.length-1){
                    sb.append(operation[i]);
                }
            }
            sb.append('=');
            sb.append(result);


        }
        return sb.toString();
    }

    public static double add(double [] arrNumbers) {
        double add = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            add = arrNumbers[i] + add;
        }
        return add;
    }

    public static double substract(double [] arrNumbers) {
        double substract = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            substract = substract - arrNumbers[i];
        }
        return substract;

    }

    public static double multipli(double [] arrNumbers) {
        double multipli = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            multipli = multipli * arrNumbers[i];
        }
        return multipli;
    }

    public static double divide(double [] arrNumbers) {
        double divide = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            divide = divide / arrNumbers[i];
        }
        return divide;
    }

    public static double proc(double [] arrNumbers) {
        double proc = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            proc = proc % arrNumbers[i];
        }
        return proc;
    }
}
