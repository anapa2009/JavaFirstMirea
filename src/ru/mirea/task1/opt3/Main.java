package ru.mirea.task1.opt3;
import java.util.Scanner; // импортируем класс
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        // создаём объект класса Scanner
        int n = 1;
        System.out.print ("Введите целое число (длину массива n, n>=1): ");

        if (sc.hasNextInt()) {
            // возвращает истину если с потока ввода можно считать
            //целое число

            n = sc.nextInt(); // считываем целое число с потока ввода
            // и сохраняем в переменную i
            System.out.println (n);
        } else {
            System.out.println ("Неверно введена длина массива - это не целое число.");
            return;
        }
        if (n<1) {
            System.out.println ("Введено значение n<1 длины массива.");
            return;
        }

        int[] arr = new int [n];

        System.out.println ("Введите значения целочисленного массива данных: ");
        int ii = 0;
        while (ii < arr.length) {
            if (sc.hasNextInt()) {
                // возвращает истину если с потока ввода можно считать целое число
                arr[ii] = sc.nextInt(); // считываем целое число с потока ввода
                // и сохраняем в элемент массива arr[ii]
                ii++;
            } else {
                System.out.println ("Введено не целое число. Повторите ввод массива.");
                return;
            }
        }

        System.out.println("Введен массив данных:");
        for (int ij = 0; ij < arr.length; ij++)
            //System.out.println(arr[ij]);
            System.out.print(arr[ij]+" ");

        System.out.println(" ");

        int sumArray=0;
        ii=0;
        for (ii = 0; ii < arr.length; ii++)
            sumArray = sumArray + arr[ii];

        System.out.println ("(1) Сумма элементов массива данных= " +  sumArray);
        //for loop;
        sumArray=0;
        ii = 0;
        while (ii < arr.length) {
            sumArray = sumArray + arr[ii];
            ii++;
        }
        System.out.println ("(2) Сумма элементов массива данных= " +  sumArray);
        //while loop;
        sumArray=0;
        ii = 0;
        do {
            sumArray = sumArray + arr[ii];
            ii++;
        } while (ii < arr.length);

        System.out.println ("(3) Сумма элементов массива данных= " +  sumArray);
        //do while loop;
    }  //-------------------------------------------------------------------------
}
