package ru.mirea.task1.opt4;
import java.util.Scanner; // импортируем класс
public class Main {
    public static void main (String [] args) {

        System.out.println ("Длина командной строки - " + args.length);

        for (int i = 0; i < args.length; i++)
            System.out.println (String.format("Argument %d: %s", i, args[i]));

    }  //-------------------------------------
}
