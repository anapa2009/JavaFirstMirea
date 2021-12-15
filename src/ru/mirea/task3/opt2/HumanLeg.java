package ru.mirea.task3.opt2;
// Define the HumanLeg class
//--------------------------------

public class HumanLeg extends Human {

    private double legUp;
    private double legDown;
    private double legFoot;

    // Constructors (overloaded)
    public HumanLeg (String nn, char gend, double r, int z, double w,
                     double dl1, double dl2, double dl3) { // 1st
        super (nn, gend, r, z, w);
        legUp=dl1;
        legDown=dl2;
        legFoot=dl3;
    }

    public HumanLeg () { // 2nd
        super ();
        legUp=40.0;
        legUp=40.0;
        legFoot=40.0;
    }

    public double getHumanLegUp () {
        return legUp;
    }
    public double getHumanLegDown () {
        return legDown;
    }
    public double getHumanLegFoot () {
        return legFoot;
    }

    public void setHumanLegUp (double dl1) {
        this.legUp=dl1;
    }
    public void setHumanLegDown (double dl2) {
        this.legUp=dl2;
    }
    public void setHumanLegFoot (double dl3) {
        this.legUp=dl3;
    }

    public String toString() {
        String str = super.toString()
                + " leg: "+String.format ("%5.1f", this.legUp)
                + " / "+String.format ("%5.1f", this.legDown)
                + " / "+String.format ("%5.1f", this.legFoot) ;
        return str;
    }


} //-------------------------------------------------------------
