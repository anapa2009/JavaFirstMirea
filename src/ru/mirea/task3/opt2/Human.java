package ru.mirea.task3.opt2;
// Define the Human class
//--------------------------------

public class Human {
    // class Human. Save as "Human.java"

    private String name;
    private char gender; //M or F;
    private double rost;
    private int razmer; //obchvatGrudi/2 (sm);
    private double weight;


    // Constructors (overloaded)
    public Human (String nn, char gend, double r, int z, double w) { // 1st
        name=nn;
        gender=gend;
        rost=r;
        razmer=z;
        weight=w;
    }

    public Human () { // 2nd
        name="Иван";
        gender='M';
        rost=170.0;
        razmer=44;
        weight=60.0;
    }

    public String getHumanName () {
        return name;
    }
    public char getHumanGender () {
        return gender;
    }
    public double getHumanRost () {
        return rost;
    }
    public int getHumanRazmer () {
        return razmer;
    }
    public double getHumanWeight () {
        return weight;
    }

    public void setHumanRost (double r) {
        this.rost=r;
    }
    public void setHumanRazmer (int z) {
        this.razmer=z;
    }
    public void setHumanWeight (double w) {
        this.weight=w;
    }

    public String toString() {
        String str = "Human: "+this.name+ " ("+this.gender+") ,"
                + " rost= "+String.format ("%6.1f", this.rost)
                + " razmer= "+this.razmer+", weight= "
                + String.format ("%6.1f", this.weight);
        return str;
    }


} //-------------------------------------------------------------

