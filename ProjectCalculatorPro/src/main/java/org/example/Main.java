package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();


    }
}


//        Scanner sc = new Scanner(System.in);
//
//
////        System.out.println("Введите оператор +  -  /  * ");
////        String st = sc.nextLine();
////        char oper = st.charAt(0);
////        if (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%') {
////            System.out.println("указанная операция не поддерживается программой");
////            return;
////        }
////
////        System.out.println("Введите num1");
////        double num1 = sc.nextDouble();
////
////        System.out.println("Введите num2");
////        double num2 = sc.nextDouble();
////
////        double result = 0;
////
////        switch (oper) {
////            case '+':
////                result = add(num1, num2);
////                break;
////            case '-':
////                result = subtract(num1, num2);
////                break;
////            case '*':
////                result = multiple(num1, num2);
////                break;
////            case '/':
////                if (num2 == 0) {
////                    System.out.println("на 0 делить нельзя.");
////                } else {
////                    result = dive(num1, num2);
////                    break;
////                }
////            case '%':
////                result = multiNull(num1, num2);
////                break;
////        }
////        if (oper == '+') {
////            result = add(num1, num2);
////        } else if (oper == '-') {
////            result = subtract(num1, num2);
////        } else if (oper == '*') {
////            result = multiple(num1, num2);
////        } else if (oper == '/') {
////            if (num2 == 0) {
////                System.out.println("на 0 делить нельзя.");
////                return;
////            }
////            result = dive(num1, num2);
////        }
//
//
//        //System.out.println(String.format("%.2f %s %.2f = %.2f", num1, oper, num2, result));
//////////////////////////////////////////////////////////////////////////////
//
//
//        // System.out.println("Желает ли пользователь выполнить еще вычисление Y/N");
//        //String frage1 = sc.nextLine();
//        //char frage2 = frage1.charAt(0);
//        String oneMore = "Y";
//        char operation = '1';
//        while (oneMore.equals(YES)) {
//            printResult("Введите оператор +  -  /  * ");
//            char operanion = sc.next().charAt(0);
//
//            operanion = isValidOperanion(operanion, sc);
//            printResult("Введите num1");
//            double num1 = getNum(operation);
//            printResult("Введите num2");
//            double num2 = getNum(operation);
//            double result = 0;
//            switch (operanion) {
//                case PLUS:
//                    result = add(num1, num2);
//                    break;
//                case Minus:
//                    result = subtract(num1, num2);
//                    break;
//                case DIVIDE:
//                    result = multiple(num1, num2);
//                    break;
//                case MULTIPLY:
//                    if (num2 == 0) {
//                        printResult("Введите другое число");
//                        return;
//                    }
//                    result = dive(num1, num2);
//                    break;
//                case REST:
//                    result = multiNull(num1, num2);
//                    break;
//            }
//            printResult(String.format("%.2f %s %.2f = %.2f", num1, operanion, num2, result));
//            System.out.println("Noch mal  Y/N");
//            oneMore = sc.nextLine();
//            while (!oneMore.equals(YES) && !oneMore.equals(NOT)) {
//                System.out.println("Enter Y or N");
//                oneMore = sc.nextLine();
//            }
//        }
//    }
//
//    private static boolean isValidOperanion(char operanion) {
//        while (operanion != PLUS && operanion != Minus && operanion != DIVIDE && operanion != MULTIPLY && operanion != '%') {
//            printResult("указанная операция не поддерживается программой");
//            operanion = sc.next().charAt(0);
//        }
//        return operanion;
//    }
//
//    private static char getOperation(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите оператор +  -  /  * ");
//        char operation = scanner.next().charAt(0);
//        while (isValidOperanion(operation)){
//            System.out.println("Операция не поддерживается. Введите ещё раз");
//            operation = scanner.next().charAt(0);
//        }
//    return operation;
//}
//    private static boolean isDivisionBuyZero(char operation, double num){
//    return operation == DIVIDE && num ==0;
//    }
//
//    private static double getNum(char operation){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        double num = scanner.nextDouble() ;
//        if (operation == '1'){
//            return num;
//        }
//
//        System.out.println("Введите второе число");
//        while (isDivisionBuyZero(operation,num)){
//            System.out.println("Деление на ноль запрещено. Введите другое число");
//            num = scanner.nextDouble();
//        }
//        return num;
//    }
//
//
//    private static void printResult(String num1) {
//        System.out.println(num1);
//    }
//
//    public static double add(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public static double subtract(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    public static double multiple(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    public static double dive(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static double multiNull(double num1, double num2) {
//        return num1 % num2;
//    }
//}