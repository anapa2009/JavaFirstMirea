package ru.mirea.task8.opt1;
public class Circle2D extends ShapeA {
    protected int radius;

    //protected String color;
    //protected int x; protected int y;

    public Circle2D (String color, int x, int y, int radius) {
        super (color, x, y);
        setRadius (radius);
    }

    public int getRadius () {
        return radius;
    }
    public void setRadius (int radius) {
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