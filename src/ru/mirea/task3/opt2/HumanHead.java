package ru.mirea.task3.opt2;
// Define the HumanHead class
//--------------------------------

public class HumanHead extends Human {
    // class Head Save as "Head.java"

    private double headSize;

    // Constructors (overloaded)
    public HumanHead (String nn, char gend, double r, int z, double w,
                      double dl) { // 1st
        super (nn, gend, r, z, w);
        headSize=dl;
    }

    public HumanHead () { // 2nd
        super ();
        headSize=57.0;
    }

    public double getHumanHeadSize () {
        return headSize;
    }

    public void setHumanArmUp (double dl) {
        this.headSize=dl;
    }

    public String toString() {
        String str = super.toString()
                + " head size= "+String.format ("%5.1f", this.headSize) ;
        return str;
    }


} //-------------------------------------------------------------
