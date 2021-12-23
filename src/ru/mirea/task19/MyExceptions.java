package ru.mirea.task19;
public class MyExceptions {

    public static void main (String[] args)  {

        //------------------------------------------------------
        try {       //Пример применения вложенных операторов try
            int a = args.length;
                  /*Если не указаны аргументы командной строки,
                    в следующем операторе будет сгенерировано
                    исключение в связи с делением на нуль. */
            int b = 10 / a;
            System.out.println ("\na = " + a);

            try {    //вложенный блок try

                 /*Если указан один аргумент командной строки,
                   то исключение в связи с делением на нуль
                   будет сгенерировано в следующем коде. */
                if (a == 1) a = a / (a - a ); // деление на нуль
                            /*Если указан один аргумент командной строки,
                              то исключение в связи с делением на нуль
                              будет сгенерировано в следующем коде. */


                if (a == 2) {
                          /*Если указаны два аргумента командной строки,
                            то генерируется исключение в связи с выходом
                            за пределы массива. */
                    int[] c = { 1 };
                    c[10] = 99; //здесь генерируется исключение в связи с
                    //выходом за пределы массива
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println ("\nИндекс за пределами массива: " + e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("\nДеление на нуль: " + e);
        }

        //-----------------------------------
        System.out.println (getHelloWorld());

        //-----------------------------------
        try {
            int a = 0;
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println ("Перехват исключений общего класса Exception.");
        }
            /*В последовательности операторов catch подкласс исключений должен быть
              указан перед его суперклассом, иначе это приведет к недостижимому коду
              и ошибке во время компиляции.

        catch (ArithmeticException e) {
                       /*Этот оператор catch вообще не будет достигнут,
                         так как подкласс ArithmeticException является
                         производным от класса Exception и стоит после него.
           //ОШИБКА!!! недостижимый код!
           System.out.println ("Этoт код вообще недостижим.");
        }
        */

        //------------------------------
        try {
            int a = 0;
            int b = 10 / a;
        }
               /*Теперь Этот оператор catch будет достигнут,
                 так как подкласс ArithmeticException является
                 производным от класса Exception и стоит впереди него */
        catch (ArithmeticException e) {
            System.out.println ("\nЭтoт код выполнится!!!");
        }
        catch (Exception e) {
            System.out.println ("\nПерехват исключений общего класса Exception.");
        }


        //--------------
        try {
            demoproc ();
        }
        catch (NullPointerException e) {
            System.out.println ("\nПовторный перехват: " + e);
        }

        //--------------
        try {
            throwOne();
        }
        catch (IllegalAccessException e) {
            System.out.println ("\nПерехвачено исключение: " + e);
        }

        //-------------------
        try {
            getFactorial (-6);
            System.out.println (getFactorial (-6));
        }
        catch (Exception e) {
            System.out.println (e.getMessage());
        }


    }  //end of main method



    //-------------------------------------
    public static String getHelloWorld () {
        //Оператор return в catch и finally
        try {
            return "TryString";
        }
        catch (Exception e) {
            return "CatchString";
        }
        finally {
            return "FinallyString";
        }
    }


    //---------------------------
    static void nesttry (int a) {
        try { //вложенный блок оператора try

            if (a == 1)
                a = a / (a - a); // деление на нуль
                       /*Если указан один аргумент командной строки,
                         то исключение в связи с делением на нуль
                         будет сгенерировано в следующем коде. */
            if (a == 2) {
                       /*Если указаны два аргумента командной строки,
                         то генерируется исключение в связи с выходом
                         за пределы массива. */
                int[] c = { 1 };
                c[10] = 99; //здесь генерируется исключение в связи с
                //выходом за пределы массива
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("\nИндeкc за пределами массива: " + e);
        }
    }


    //----------------------
    static void demoproc() {
        try {
            throw new NullPointerException ("\nдемонстрация");
            //Создать объект стандартных исключений в Java
            //Символьная строка описывает исключение
        }
        catch (NullPointerException e) {
            System.out.println ("\nИсключение перехвачено в теле метода demoproc()");
            throw e; // повторно сгенерировать исключение
        }
    }

    //----------------------------------------------------
    static void throwOne () throws IllegalAccessException {
        System.out.println ("\nВ теле метода throwOne()");
        throw new IllegalAccessException ("\nдемонстрация");
    }

    //--------------------------------------------------
    static int getFactorial (int num) throws Exception {
        if (num < 1)
            throw new Exception ("\nЧисло меньше 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}   //end of class MyExceptions