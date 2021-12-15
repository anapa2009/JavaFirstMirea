package ru.mirea.task13.opt1;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;


public class ArrayListMethods {
    public static void main (String[] args) {

        ArrayList a1 = new ArrayList ();
        //разные типы данных в a1
        a1.add (1);
        a1.add ("Box");
        System.out.println (a1.get(0));
        System.out.println (a1.get(1));
        System.out.println ();


        //------------------------------------------
        ArrayList <String> a2 = new ArrayList <> ();
        //в a2 данные типа String
        a2.add ("cd");
        a2.add (0, "ab");
        //это будет 1-й элемент списка
        System.out.println (a2.toString());
        System.out.println ();


        //------------------------------------------
        ArrayList <Test> tests = new ArrayList <> ();
        //в tests данные типа Test (числа)

        tests.add (new Test (10));
        //задаем число 10 как объект класса Test
        Test t = new Test (20);
        //t - экземпляр класса Test
        tests.add (t);
        tests.add (new Test (33));

        for (Test test : tests) {
            System.out.print (test.n + " ");
            //test.n - это просто записанное число
        }
        System.out.println ();


        //--------------------------
        tests.set (2, new Test(30));
        //задаем 3-й элемент списка (index=2)
        tests.remove (0);
        //удаляем 1-й элемент списка

        for (Test test : tests) {
            System.out.print (test.n + " ");
        }
        System.out.println ();


        //----------------
        a1.addAll (1, a2);

        for (int i = 0; i < a1.size (); i++) {
            System.out.print (a1.get (i) + " "); //(a1 + " ");
        }
        System.out.println ();

        System.out.println ("a1.contains (cd)= " + a1.contains ("cd"));
        System.out.println ();

        System.out.println ("a1.indexOf (cd)= " + a1.indexOf ("cd"));
        System.out.println ();

        a1.set(a1.indexOf("cd"), "cd_new");

        for (int i = 0; i < a1.size (); i++) {
            System.out.print (a1.get (i) + " "); //(a1 + " ");
        }
        System.out.println ();

        System.out.println ("a1.isEmpty ()= " + a1.isEmpty ());
        System.out.println ();

        System.out.println ("a1.lastIndexOf (cd_new)= "
                + a1.lastIndexOf ("cd_new"));
        System.out.println ();


        //------------------------------------------------
        Integer[] nums = {10, -5, 4, 8, -2, -10, 1, 4, 2};
        ArrayList <Integer> numList = new ArrayList <> (Arrays.asList(nums));
        //обычный массив преобразуется в список
        //с помощью метода asList()

        Iterator <Integer> numListIter = numList.iterator ();
        while (numListIter.hasNext ()) {
            int n = numListIter.next ();
            if (n < 0) {
                numListIter.remove ();
            }
        }
        System.out.println (numList);
        System.out.println ();

    }
}


//----------
class Test {
    int n;
    Test (int num) {
        this.n = num;
    }
}