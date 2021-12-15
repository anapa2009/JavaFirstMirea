package ru.mirea.task4.opt2;
import java.lang.*;

public class BallNew {
    private double x=0.0;
    private double y=0.0;

    public BallNew (double x, double y) {
        setXY (x,y);
    }
    public BallNew () {
        setXY (0.0, 0.0);
    }
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public void setX (double x) {
        this.x = x;
    }
    public void setY (double y) {
        this.y = y;
    }
    public void setXY (double x, double y) {
        this.x = x; //setX(x);
        this.y = y; //setY(y);
    }
    public void move (double xDisp, double yDisp) {
        //setXY(getX()+xDisp, getY()+yDisp);
        this.x = x+xDisp;
        this.y = y+yDisp;
    }

    @Override
    public String toString() {
        //return "BallNew (" + this.getX() + ", " + this.getY() + ")";
        return "BallNew (" + this.x + ", " + this.y + ")";
    }
}