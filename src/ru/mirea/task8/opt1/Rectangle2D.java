package ru.mirea.task8.opt1;

public class Rectangle2D extends ShapeA {
    protected int width;
    protected int length;

    //protected String color;
    //protected int x; protected int y;

    public Rectangle2D (String color, int x, int y,
                        int width, int length) {
        super (color, x, y);
        setWidth (width);
        setLength (length);
    }

    public int getWidth () {
        return width;
    }
    public void setWidth (int width) {
        this.width = width;
    }
    public int getLength () {
        return length;
    }
    public void setLength (int length) {
        this.length = length;
    }

    public int getArea () {
        return width * length;
    }
    public int getPerimeter () {
        return 2 * (width + length);
    }
    public String toString () {
        return "Rectangle with width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
    }
}