package ru.mirea.task18;
import java.util.Random;

class ExamplesException {
    //Пример обработки исключения

    public static void main (String[] args) {
        int d, a;

        System.out.println ();

        //------------------------------------
        try {    //проконтролировать блок кода
            d = 0;
            a = 10 / d;
            System.out.println ("Это не будет выведено!!!");
        }
        catch (ArithmeticException e) {
            //перехватываем ошибку и выводим сообщение с описанием ошибки
            System.out.println
                    ("ОШИБКА!!!\nДеление на нуль вызвало исключение:\n" + e);
        }

        System.out.println ("\n//... код после оператора catch");

        //------------------
        try {
            procA();
        } catch (Exception e) {
            System.out.println ("Исключение перехвачено");
        }
        procB();
        procC();

        //---------------------------------
        int a1 = 0, b = 0, c = 0;
        Random r = new Random ();

        System.out.println ();

        for (int i = 0; i < 10; i++) {
            try {
                b = r.nextInt ();
                c = r.nextInt ();
                a1 = 12 / (b / c);
            }
            catch (ArithmeticException e) {
                System.out.println ("  Деление на нуль.");
                a1 = 0; // присвоить нуль и продолжить работу
            }
            System.out.println (i + " a1= " + a1);
        }

        //-----------------------
        try {
            int a2 = args.length;
                       /* Если не указаны аргументы командной строки,
                          в следующем операторе будет сгенерировано
                          исключение в связи с делением на нуль. */
            int b2 = 10 / a2;

            System.out.println ("\na2 = " + a2);
            nesttry (a2);
        }
        catch (ArithmeticException e) {
            System.out.println ("\nДеление на нуль: " + e);
        }

        //-----------------------------
        try {
            int a3 = args.length;
            System.out.println ("a3 = " + a3);
            int b3 = 10 / a3;
            int[] m = {1};
            m[10] = 99;
        }
        catch (ArithmeticException e) {
            System.out.println ("ОШИБКА!!!\nДеление на нуль: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("ОШИБКА!!!\nОшибка индексации за пределами массива: " + e);
        }
        System.out.println("\n//... код после блока операторов try/catch");


    }  //end of main method



    //-------------------
    static void procA() {
        //сгенерировать исключение в методе
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    static void procB() {
        //возвратить управление из блока оператора try
        try {
            System.out.println ("B теле метода procB()");
            return;
        } finally {
            System.out.println ("Блок оператора finally в методе procB()");
        }
    }

    static void procC() {
        //выполнить блок try, как обычно
        try {
            System.out.println ("B теле метода procC()");
        } finally {
            System.out.println ("Блок оператора finally в методе procC()");
        }
    }

    //---------------------------
    static void nesttry (int a) {
        try { //вложенный блок оператора try

            if (a == 1) a = a / (a - a); // деление на нуль
                     /* Если указан один аргумент командной строки,
                        то исключение в связи с делением на нуль
                        будет сгенерировано в следующем коде. */
            if (a == 2) {
                     /* Если указаны два аргумента командной строки,
                        то генерируется исключение в связи с выходом
                        за пределы массива. */
                int[] c = { 1 };
                c[10] = 99; //здесь генерируется исключение в связи с
                //выходом за пределы массива
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Индeкc за пределами массива: " + e);
        }
    }


}