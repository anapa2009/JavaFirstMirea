package ru.mirea.task7.opt3;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape (String color, boolean filled) {
        setColor (color);
        setFilled (filled);
    }

    public Shape () {
        this ("green", true);
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public boolean isFilled () {
        return filled;
    }

    public void setFilled (boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    abstract public String toString();
}