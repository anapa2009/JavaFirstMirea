package ru.mirea.task6.opt2;
import java.lang.*;

public class ElemFurniture0 extends Furniture0
        implements Priceable {

    protected String element;
    protected double width;
    protected double glubina;
    protected double height;

    public ElemFurniture0 (String ff, double cc, String mm,
                           String elem, double ww, double gl, double hh) {
        super (ff, cc, mm);

        setElement (elem);
        setWidth (ww);
        setGlubina (gl);
        setHeight (hh);
    }
    public ElemFurniture0 () {
        super ();
        setElement ("shkaff");
        setWidth (1.0);
        setGlubina (1.0);
        setHeight (1.0);
    }

    public String getElement () {
        return element;
    }
    public void setElement (String elem) {
        this.element = elem;
    }


    public double getWidth () {
        return width;
    }
    public void setWidth (double ww) {
        this.width = ww;
    }


    public double getGlubina () {
        return glubina;
    }
    public void setGlubina (double gl) {
        this.glubina = gl;
    }


    public double getHeight () {
        return height;
    }
    public void setHeight (double hh) {
        this.height = hh;
    }


    public double getPrice() {
        return super.getCena ();
    }


    public String toString() {
        return "\nFurniture: " + this.element + ". Sizes: "
                + String.format ("%6.2f", this.width) + "/"
                + String.format ("%6.2f", this.glubina) + "/"
                + String.format ("%6.2f", this.height)
                + ". Material: " + this.material
                + ". Production: " + this.firma
                + ". Price " + this.cena;
    }
}