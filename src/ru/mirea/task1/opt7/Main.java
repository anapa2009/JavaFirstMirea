package ru.mirea.task1.opt7;
import java.util.Scanner; // импортируем класс
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        // создаём объект класса Scanner
        int n = 1;
        System.out.print ("Введите целое число (n>=1): ");

        if (sc.hasNextInt()) {
            // возвращает истину если с потока ввода можно считать
            //целое число

            n = sc.nextInt(); // считываем целое число с потока ввода
            // и сохраняем в переменную i
            System.out.println (n);
        } else {
            System.out.println ("Неверно введено число n - это не целое число.");
            return;
        }
        if (n<1) {
            System.out.println ("Введено значение n<1.");
            return;
        }

        long res=getFactorial(n);
        //System.out.println(" ");
        System.out.println("Результат: " + n + "! = " + res);
        //System.out.println(" ");

    }
//-------------------------------------

    //----------------------------------------
    public static long getFactorial(int n) {
        //int result = 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            //int<=2147483648
        }
        return result;
    }
//-----------------------------------------//

}