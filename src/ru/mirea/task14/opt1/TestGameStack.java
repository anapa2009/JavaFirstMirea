package ru.mirea.task14.opt1;
import java.util.Stack;

public class TestGameStack {
    //Stack <Integer> fpl, spl;

    //---------------------------------------
    public static void main (String[] args) {

        System.out.println ();
        System.out.println (new GameStack ("13579", "24680").play());

        System.out.println ();
        System.out.println (new GameStack ("12345", "67890").play());

        System.out.println ();
        System.out.println (new GameStack ("13079", "42685").play());
        //System.out.println ();

        System.out.println ();
        System.out.println (new GameStack ("52603", "81479").play());
        //System.out.println ();

        System.out.println ();
        System.out.println (new GameStack ("81479", "52603").play());
        System.out.println ();   }
}