package ru.mirea.task13.opt3;

public class MyArrayListMethods {

    public static void main (String[] args) {

        MyArrayList <Object> mylist = new MyArrayList <> ();
        //разные типы данных в list
        mylist.add (1);
        mylist.add ("Box");
        mylist.add (22);
        mylist.add ("New");
        System.out.println (mylist.get(0));
        System.out.println (mylist.get(1));
        System.out.println ();

        for (int i = 0; i < mylist.size (); i++) {
            System.out.print (mylist.get (i) + " ");
        }

        System.out.println ("\nразмер mylist.size()= " + mylist.size());
        System.out.println ();

        System.out.println ("mylist.get(2)= " + mylist.get(2));
        System.out.println ();

        mylist.remove(2);
        System.out.println ("After removing: ");

        for (int i = 0; i < mylist.size (); i++) {
            System.out.print (mylist.get (i) + " ");
        }
        System.out.println ();

        for (int i = 0; i<20; i++) {
            mylist.add (22+i);
        }
        System.out.println ("размер mylist.size()= " + mylist.size());
        System.out.println ();

        for (int i = 0; i < mylist.size (); i++) {
            System.out.print (mylist.get (i) + " ");
        }
        System.out.println ();

    }
}