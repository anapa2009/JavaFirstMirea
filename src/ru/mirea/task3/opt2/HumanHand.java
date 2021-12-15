package ru.mirea.task3.opt2;
// Define the HumanHand class
//--------------------------------

public class HumanHand extends Human {
    // class HumanHand Save as "HumanHand.java"

    private double armUp;
    private double armDown;
    private double armHand;

    // Constructors (overloaded)
    public HumanHand (String nn, char gend, double r, int z, double w,
                      double dl1, double dl2, double dl3) { // 1st
        super (nn, gend, r, z, w);
        armUp=dl1;
        armDown=dl2;
        armHand=dl3;
    }

    public HumanHand () { // 2nd
        super ();
        armUp=40.0;
        armDown=40.0;
        armHand=20.0;
    }

    public double getHumanArmUp () {
        return armUp;
    }
    public double getHumanArmDown () {
        return armDown;
    }
    public double getHumanArmHand () {
        return armHand;
    }

    public void setHumanArmUp (double dl1) {
        this.armUp=dl1;
    }
    public void setHumanArmDown (double dl2) {
        this.armUp=dl2;
    }
    public void setHumanArmHand (double dl3) {
        this.armHand=dl3;
    }

    public String toString() {
        String str = super.toString()
                + " arm: "+String.format ("%5.1f", this.armUp)
                + " / "+String.format ("%5.1f", this.armDown)
                + " / "+String.format ("%5.1f", this.armHand) ;
        return str;
    }


} //-------------------------------------------------------------

