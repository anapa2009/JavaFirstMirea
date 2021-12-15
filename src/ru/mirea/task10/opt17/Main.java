package ru.mirea.task10.opt17;
import java.util.Scanner;

class Main {

    //-----------------------------------------
    public static void main (String [ ] args) {
        int numb=1000000000;
        int max = 0;

        System.out.println ("\nВведите последовательность натуральных чисел, по одному в строке.");
        System.out.println ("Последнее число последовательности - 0.\n");

        //До тех пор, пока не будет введён 0, будет вызываться функция getNumb
        while (numb>=0) {
            numb = getNumb ();
            if (numb==0) {
                break;
            }
            //Вычисление максимального из двух чисел
            else if (numb>max) {
                max = numb;
            }
        }
        System.out.print("\nMaximum= " + max);
    }


    //---------------------
    static int getNumb () {
        //Ввод натурального числа с экрана
        Scanner sc = new Scanner (System.in);
        //создаём объект класса Scanner

        int numb = 0;

        if (sc.hasNextInt ()) {
            //возвращает истину если с потока ввода можно считать
            //целое число

            numb = sc.nextInt (); // считываем целое число с потока ввода
            //System.out.println (numb);
        } else {
            System.out.println ("Введите число заново - это не целое число");
            return 0;
        }
        if (numb<0) {
            System.out.println ("Введено отрицательное число");
            return 0;
        }
        return numb;
    }
}