package ru.mirea.task2.opt1;
import java.lang.*;

public class Shape0 {
    protected String color;
    protected boolean filled;

    public Shape0 (String color, boolean filled) { //конструктор
        setColor (color);
        setFilled (filled);
    }
    public Shape0 () { //конструктор 2
        this ("green", true);
    }

    public void setColor (String color) {
        this.color = color;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }

    public String getColor () {
        return color;
    }
    public boolean getFilled () {
        return filled;
    }

    public String toString() {
        String str;
        if (this.filled)
            str = "Shape is filled, color is "+this.color;
        else
            str = "Shape isn't filled, color is "+this.color;
        return str;
    }
}