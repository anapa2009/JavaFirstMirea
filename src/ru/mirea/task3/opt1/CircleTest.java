package ru.mirea.task3.opt1;

public class CircleTest { // Save as "CircleTest.java"

    public static void main(String[] args) { // Execution entry point

        // Construct an instance of the Circle class called c1
        Circle c1 = new Circle (2.0, "blue"); // Use 2nd constructor

        String xStr = String.format ("%7.2f", c1.getXCoordCircle());
        String yStr = String.format ("%7.2f", c1.getYCoordCircle());
        String rStr = String.format ("%.2f", c1.getRadiusCircle());
        String lenStr = String.format ("%.2f", c1.getLengthCircle());
        String areaStr = String.format ("%.2f", c1.getAreaCircle());

        System.out.println ("Circle centre is (" + xStr + " , " + yStr + ") "
                + "Radius is " + rStr + " Color is " + c1.getColorCircle()
                + " Circle length is " + lenStr + " Area is " + areaStr);

        Circle c2 = new Circle (10., 10., 5.0, "red"); // Use 1st constructor

        xStr = String.format ("%7.2f", c2.getXCoordCircle());
        yStr = String.format ("%7.2f", c2.getYCoordCircle());
        rStr = String.format ("%.2f", c2.getRadiusCircle());
        lenStr = String.format ("%.2f", c2.getLengthCircle());
        areaStr = String.format ("%.2f", c2.getAreaCircle());

        System.out.println ("Circle centre is (" + xStr + " , " + yStr + ") "
                + "Radius is " + rStr + " Color is " + c1.getColorCircle()
                + " Circle length is " + lenStr + " Area is " + areaStr);

        System.out.println (c1.equalsCircle (c2));
        System.out.println (c1 == c2);

        System.out.println("\n"+c2.toString());
    }
}
