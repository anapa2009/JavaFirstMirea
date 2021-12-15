package ru.mirea.task6.opt2;
import java.lang.*;

public abstract class Furniture0 implements Priceable {
    protected String firma;
    protected double cena;
    protected String material;

    public Furniture0 (String ff, double cc, String mm) {
        setFirma (ff);
        setCena (cc);
        setMaterial (mm);
    }
    public Furniture0 () {
        this ("aaa", 1.0, "mmm");
    }

    public String getFirma () {
        return firma;
    }
    public void setFirma (String ff) {
        this.firma = ff;
    }

    public double getCena () {
        return cena;
    }
    public void setCena (double cc) {
        this.cena = cc;
    }

    public String getMaterial () {
        return material;
    }
    public void setMaterial (String mm) {
        this.material = mm;
    }

    public double getPrice() {
        return getCena ();
    }


    abstract public String toString();

}