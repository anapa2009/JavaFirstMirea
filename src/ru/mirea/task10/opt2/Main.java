package ru.mirea.task10.opt2;
import java.util.Scanner;

class Main {

    public static void main (String [ ] args) {
        int nn=0;

        Scanner sc = new Scanner (System.in);
        //создаём объект класса Scanner
        System.out.println ("\nВведите число (n>0): ");

        if (sc.hasNextInt ()) {
            //возвращает истину если с потока ввода можно считать
            //целое число
            nn = sc.nextInt (); // считываем целое число с потока ввода
        } else {
            System.out.println ("Введите число заново - это не целое число");
            return; // 0;
        }
        if (nn<0) {
            System.out.println ("Введено отрицательное число");
            return; // 0;
        }

        recursion (nn);
    }

    //--------------------------------------
    public static String recursion (int n) {
        //int sum=0;
        int j=0;
        //System.out.println ("recursion, n=" + " " + n);

        if (n==1) {
            //Базовый случай
            System.out.print ("1");
        } else {
            j=n;
            System.out.print (recursion (--n) + " " + j);
            //Рекурсивное условие
        }
        return "";
    }

}