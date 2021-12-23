package ru.mirea.task17;
enum Apple {Jonathan, GoldenDel, RedDel, Winesap, Cortland}
//Пример: перечисление сортов яблок
//Продемонстрировать применение методов ordinal(), compareTo() и equals()

enum Apple3 {
    //Использовать конструктор, переменную экземпляра и метод в перечислении
    //цена яблока каждого сорта
    Jonathan (10), GoldenDel (9), RedDel (12), Winesap (15), Cortland (8);

    private int price; //Переменная экземпляра price, служит для хранения цены

    //Конструктор Apple3(), ему передается цена
    //(аргументы конструктору передаются в скобках после каждой перечисляемой константы)
    Apple3 (int p) {
        //Конструктор Apple3(), ему передается цена (аргументы конструктору
        //передаются в скобках после каждой перечисляемой константы)
        price = p;
    }


    int getPrice () {
        //Метод getPrice(), возвращающий значение цены
        return price;
    }
}


//--------------
class EnumDemo {

    public static void main (String[] args) {
        Apple ap; // объявляется переменная ар перечислимого типа Apple

        ap = Apple.RedDel; //переменной ар присваивается значение RedDel

        System.out.println ();
        System.out.println ("Значение ap: " + ap);
        //вывести значение перечислимого типа
        System.out.println ();

        ap = Apple.GoldenDel;


        if (ap == Apple.GoldenDel)
            System.out.println ("Переменная ар содержит GoldenDel.\n");
        //сравнить два значения перечислимого типа

        //-----------
        switch (ap) {
            //применить перечисление для управления оператором switch
            case Jonathan:
                System.out.println ("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println ("Сорт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println ("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println ("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println ("Copт Cortland красный.");
                break;
        }


        //---------------------------------
        Apple allapples[] = Apple.values ();
        //создается переменная allapples, которой присваивается
        //ссылка на массив значений перечислимого типа
        System.out.println ();

        for (Apple a : allapples) {
            System.out.println (a);
        }

        System.out.println("\nКонстанты перечислимого типа Apple:");

        for (Apple a : Apple.values() ) {
            //цикл for можно написать и без переменной allapples
            System.out.print (a + " ");
        }

        System.out.println("\n");

        ap = Apple.valueOf ("Winesap");
        //метод valueOf() возвращает значение перечислимого типа,
        //связанное с именем константы того же типа, передаваемым
        //этому методу в виде символьной строки
        System.out.println ("Пepeмeннaя ар содержит " + ap);


        //----------------------

        System.out.println ("Яблoкo сорта " + Apple3.valueOf ("Winesap") + " стоит " +
                Apple3.valueOf ("Winesap").getPrice());
        //У каждой константы перечислимого типа имеется своя копия
        //переменной экземпляра price, поэтому для получения цены на
        //определенный сорт яблок достаточно вызвать метод getPrice()

        System.out.println ("\nЦeны на все сорта яблок:");
        for (Apple3 a : Apple3.values()) {
            //вывести цены на все сорта яблок
            System.out.println(a + " стоит " + a.getPrice());
        }


        //-------------------
        Apple ap1, ap2, ap3;

        System.out.println ("\nПолучить все константы и порядковые значения:");

        for (Apple a: Apple.values()) {
            System.out.println (a + " " + a.ordinal());
        }

        ap1 = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println ("\nПродемонстрировать применение метода compareTo ():");
        if (ap1.compareTo (ap2) < 0)
            System.out.println (ap1 + " предшествует " + ap2);
        if (ap1.compareTo(ap2) > 0)
            System.out.println (ap2 + " предшествует " + ap1);
        if (ap1.compareTo (ap3) == 0)
            System.out.println (ap1 + " равно " + ap3);

        System.out.println ("\nПродемонстрировать применение метода equals ():");
        if (ap1.equals (ap2))
            System.out.println ("Ошибка!");
        if (ap1.equals (ap3))
            System.out.println (ap1 + " равно " + ap3);

        System.out.println ("\nСравнить на равенство:");
        if (ap1 == ap3)
            System.out.println (ap1 + " == " + ap3);

    }
}