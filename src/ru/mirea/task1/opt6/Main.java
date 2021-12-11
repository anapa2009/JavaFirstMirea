package ru.mirea.task1.opt6;
import java.util.Scanner; // импортируем класс
import java.util.Random;
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

        int min = 10;  //нижняя граница диапазона случайных чисел
        int max = 100; //верхняя граница диапазона случайных чисел
        System.out.println("Диапазон значений: " + min + " - " + max);


        int i = 0;
        int j = 0;

        for (i = 0; i < n; i++) {

            Random r = new Random();
            int randomInt = r.nextInt(max - min) + min;

            arr[i]=randomInt;
        }

        System.out.println(" ");

        System.out.println("Введен массив данных  (1-й метод):");
        for (j = 0; j < arr.length; j++)
            System.out.print(arr[j]+" ");

        System.out.println(" ");

        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr[j]<arr[i]) {
                    int ii = arr[j];
                    arr[j] = arr[i];
                    arr[i] = ii;
                }
            }
        }

        System.out.println("Отсортированный массив данных:");
        for (j = 0; j < arr.length; j++)
            System.out.print(arr[j]+" ");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Введен массив данных (2-й метод):");

        for (i = 0; i < n; i++) {
            int randomNumber = (int)(Math.random() * (max + 1 - min) + min);
            arr[i]=randomNumber;
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");


        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr[j]<arr[i]) {
                    int ii = arr[j];
                    arr[j] = arr[i];
                    arr[i] = ii;
                }
            }
        }

        System.out.println("Отсортированный массив данных:");
        for (j = 0; j < arr.length; j++)
            System.out.print(arr[j]+" ");

        System.out.println(" ");

    }  //-------------------------------------
}


