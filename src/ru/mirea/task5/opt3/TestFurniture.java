package ru.mirea.task5.opt3;

public class TestFurniture { // Save as "TestFurniture.java"

    public static void main (String[] args) { // Execution entry point

        ElemFurniture c1 = new ElemFurniture (); // Use 2nd constructor
        System.out.println("\n"+c1.toString());

        Table c2 = new Table ();
        System.out.println("\n"+c2.toString());

        System.out.println("\nTable surface area= "+c2.getAreaTable());
    }
}
