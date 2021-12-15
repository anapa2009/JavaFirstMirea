package ru.mirea.task5.opt3;
import java.lang.*;

public abstract class Furniture {
    protected String firma;
    protected double cena;
    protected String material;

    public Furniture (String ff, double cc, String mm) {
        setFirma (ff);
        setCena (cc);
        setMaterial (mm);
    }
    public Furniture () {
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

    abstract public String toString();

}