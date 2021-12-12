package ru.mirea.task1.opt5;
public class Main {
    public static void main (String [] args) {

        for (int i = 1; i < 11; i++) {

            float num=1.0f/i;
            String str = String.format ("%.4f", num);
            System.out.print (str + "  ");

        }

    }  //-------------------------------------//
}