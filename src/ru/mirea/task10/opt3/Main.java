package ru.mirea.task10.opt3;
import java.util.Scanner;

class Main {

    //-----------------------------------------
    public static void main (String [ ] args) {
        int nn=0;
        int a=0;
        int b=0;

        Scanner sc = new Scanner (System.in);
        System.out.println ("\nВведите два целых числа A, B (одно число в строке): ");

        for (int k = 1; k <= 2; k++) {
            if (sc.hasNextInt ()) {
                //возвращает истину если с потока ввода можно считать целое число
                nn = sc.nextInt (); // считываем целое число с потока ввода
            } else {
                System.out.println ("Введите число заново - это не целое число");
                return; // 0;
            }
            if (k==1)
                a=nn;
            if (k==2)
                b=nn;
        }

        System.out.println (recursion (a, b));
    }


    //---------------------------------------------
    public static String recursion (int a, int b) {
        int j=0;

        if (a > b) {

            if (a == b) {
                //Базовый случай
                return Integer.toString(a);
            }
            else {
                return a + " " + recursion (a-1, b);
                //Рекурсивное условие
            }

        } else {

            if (a == b) {
                //Базовый случай
                return Integer.toString(a);
            }
            else {
                return a + " " + recursion (a+1, b);
                //Рекурсивное условие
            }
        }
        //return " ";
    }

}

