package ru.mirea.task7.opt3;

public class Circle extends Shape {
    protected double radius;

    public Circle (double radius, String color, boolean filled) {
        super (color, filled);
        setRadius (radius);
    }
    public Circle (double radius) {
        super ();
        setRadius (radius);
    }
    public Circle () {
        this (1);
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return Math.PI * Math.pow(radius, 2); //pi*r^2
    }

    public double getPerimeter () {
        return 2.0 * Math.PI * radius; //2*pi*r
    }
    public String toString () {
        return "Circle with radius=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
    }
}