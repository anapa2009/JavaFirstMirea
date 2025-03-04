package ru.mirea.task7.opt5;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
    @Override
    public void moveUp() {
        y+=ySpeed; //y=y+ySpeed; //y++;
    }
    @Override
    public void moveDown() {
        y-=ySpeed; //y=y-ySpeed; //y--;
    }
    @Override
    public void moveRight() {
        x+=xSpeed; //x=x+xSpeed; //x++;
    }
    @Override
    public void moveLeft() {
        x-=xSpeed; //x=x-xSpeed; //x--;
    }
}
