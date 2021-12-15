package ru.mirea.task3.opt2;
import java.util.Scanner; // импортируем класс

public class HumanTest {

    public static void main(String[] args) { // Execution entry point

        // Construct an instance of the Human class called c1
        Human c1 = new Human (); // Use 2nd constructor

        HumanHead c1Head = new HumanHead ();
        HumanHand c1Hand = new HumanHand ();
        HumanLeg c1Leg = new HumanLeg ();

        System.out.println("\n"+c1Head.toString());

        System.out.println("\n"+c1Hand.toString());

        System.out.println("\n"+c1Leg.toString());

        System.out.println("\n"+c1.toString());
    }
}
