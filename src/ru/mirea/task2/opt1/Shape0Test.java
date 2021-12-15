package ru.mirea.task2.opt1;

public class Shape0Test {

    public static void main (String[] args) {

        Shape0 c1 = new Shape0 ("red", false); // Use 1st constructor
        Shape0 c2 = new Shape0 (); // Use 2nd constructor

        String str=c1.toString ();
        System.out.println("\n"+str);

        str=c2.toString ();
        System.out.println("\n"+str);
    }
}
