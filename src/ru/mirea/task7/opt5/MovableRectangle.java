package ru.mirea.task7.opt5;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public boolean isEqualSpeed=true;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed,
                             int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public String toString () {
        return "Rectangle (" + topLeft.x + ", " + topLeft.y + ", " +
                bottomRight.x + ", " + bottomRight.y + ")"
                + ", moving speeds: (" + topLeft.xSpeed + ", " + topLeft.ySpeed
                + "), (" + bottomRight.xSpeed + ", " + bottomRight.ySpeed + ")";
    }

    private boolean isEqualSpeed () {
        return ((topLeft.xSpeed==bottomRight.xSpeed) &&
                (topLeft.ySpeed==bottomRight.ySpeed));
    }

    public void setSpeed (int xSpeed, int ySpeed, int num) {
        //method to change speeds of points
        if (num==0) {
            topLeft.ySpeed = ySpeed;
            topLeft.xSpeed = xSpeed;
        }
        else {
            bottomRight.ySpeed = ySpeed;
            bottomRight.xSpeed = xSpeed;
        }
    }


    @Override
    public void moveUp () {
        if (isEqualSpeed()) {
            topLeft.moveUp ();
            bottomRight.moveUp ();
        }
    }
    @Override
    public void moveDown () {
        if (isEqualSpeed()) {
            topLeft.moveDown ();
            bottomRight.moveDown ();
        }
    }
    @Override
    public void moveRight () {
        if (isEqualSpeed()) {
            topLeft.moveRight ();
            bottomRight.moveRight ();
        }
    }
    @Override
    public void moveLeft () {
        if (isEqualSpeed()) {
            topLeft.moveLeft ();
            bottomRight.moveLeft ();
        }
    }
}
