package ru.mirea.task3.opt1;
// Define the Circle class
//--------------------------------

public class Circle {

    private double x_cen, y_cen;  // circle centre coordinates;
    private double radius;
    private String color;


    // Constructors (overloaded)
    public Circle (double x, double y, double rr, String str) { // 1st
        x_cen=x;
        y_cen=y;
        radius=rr;
        color=str;
    }

    public Circle (double rr, String str) { // 2nd
        x_cen=0.;
        y_cen=0.;
        radius=rr;
        color=str;
    }

    public Circle (String str) { // 3rd
        x_cen=0.;
        y_cen=0.;
        radius=1.;
        color=str;
    }

    public Circle () { // 4th
        x_cen=0.;
        y_cen=0.;
        radius=1.;
        color="black";
    }


    public void setCoordCircle (double x, double y) { // methods
        x_cen=x;
        y_cen=y;
    }

    public void setXCoordCircle (double x) {
        x_cen=x;
    }

    public void setYCoordCircle (double y) {
        y_cen=y;
    }

    public void setRadiusCircle (double rr) {
        radius=rr;
    }

    public void setColorCircle (double rr) {
        radius=rr;
    }


    public double getXCoordCircle () {
        return x_cen;
    }

    public double getYCoordCircle () {
        return y_cen;
    }

    public double getRadiusCircle () {
        return radius;
    }

    public String getColorCircle () {
        return color;
    }



    public double getLengthCircle () {
        return 2.0*radius*Math.PI;
    }

    public double getAreaCircle () {
        return radius*radius*Math.PI;
    }

    public boolean equalsCircle (Object obj) {
        //Comparing parameters of two circles (or objects)

        if ( (obj == null) | (!(obj instanceof Circle)) )
            return false;
        else if (this == obj)
            return true;
        else
            return false;
    }

    public String toString() {
        String xStr = String.format ("%7.2f", this.x_cen);
        String yStr = String.format ("%7.2f", this.x_cen);
        String rStr = String.format ("%.2f", this.radius);
        String lenStr = String.format ("%.2f", this.getLengthCircle());
        String areaStr = String.format ("%.2f", this.getAreaCircle());

        String str;
        str="Circle centre is (" + xStr + " , " + yStr + "), "
                + "radius is " + rStr + ", color is " + this.color
                + ", " + "area = " + areaStr + ", length = " + lenStr;

        return str;
    }


} //-------------------------------------------------------------

