package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String oneMore = Const.YES;
        char operation = '1';
        String[] st = new String[Const.HISTORY];

         while (oneMore.equals(Const.YES)) {
         System.out.println("Kol-vo simvolov");
                int kol = scanner.nextInt();
                while (kol < 2) {
                    System.out.println("Введите не меньше 2х ");
                    kol = scanner.nextInt();
                }
                double[] arrNumbers = new double[kol];
                char[] arrOperation = new char[kol-1];
                for (int i = 0; i < arrNumbers.length; i++) {
                    arrNumbers[i] = Utils.getNum(operation);
                    if (i<arrNumbers.length-1){
                        arrOperation[i] = Utils.getOperation();
                    }

                }
                System.out.println(Arrays.toString(arrNumbers));
                //operation = Utils.getOperation();
                double result = Utils.getResult(arrOperation, arrNumbers);
             System.out.println(Utils.printResult(arrOperation, arrNumbers, result));
         System.out.println("Do you want to continue? Y/N");
         oneMore = scanner.next();
        while (!oneMore.equalsIgnoreCase(Const.YES) && !oneMore.equalsIgnoreCase(Const.NO)) {
           System.out.println("Please, enter 'Y' or 'N'");
           oneMore = scanner.next();
        }
             System.out.println("Посмотреть историю? Y/N");



             for (int i = st.length-1; i > 0; i--) {
                 st[i]= st[i-1];
             }
             st[0]=Utils.printResult(arrOperation, arrNumbers, result);

             System.out.println(Arrays.toString(st));
         }
    }
}
