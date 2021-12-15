package ru.mirea.task8.opt1;
import java.lang.*;

public abstract class ShapeA {
    protected String color;
    protected int x;
    protected int y;

    public ShapeA (String color, int x, int y) { //boolean filled,
        setColor (color);
        this.x = x;
        this.y = y;
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public int getX () {
        return x;
    }
    public void setX (int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }
    public void setY (int y) {
        this.y = y;
    }

    abstract public String toString();
}