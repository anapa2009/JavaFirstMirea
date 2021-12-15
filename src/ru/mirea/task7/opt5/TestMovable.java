package ru.mirea.task7.opt5;

public class TestMovable {
    public static void main (String[] args) {

        // Создаем экземпляр класса MovablePoint
        MovablePoint point = new MovablePoint (0, 0, 2, 2);
        System.out.println("\n" + point);

        //Двигаем point вверх и влево
        point.moveUp();
        point.moveLeft();
        //System.out.println(point);
        System.out.println("Up -> Left, xspeed=yspeed=2 => " + point);

        //Создаем экземпляр класса MovableCircle
        MovableCircle circle = new MovableCircle (0, 0, 3, 3, 2);
        System.out.println("\nIni values - " + circle);

        //Двигаем circle вниз и вправо
        circle.moveDown();
        circle.moveRight();
        System.out.println("Up -> Left, xspeed=yspeed=3 => " + circle);
        //System.out.println(circle);

        //Создаем экземпляр класса MovableRectangle
        MovableRectangle rectangle =
                new MovableRectangle (0, 0, 1, 1, 4, 4);
        System.out.println("\nIni values - " + rectangle);

        //Двигаем rectangle вверх и влево
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println("Up -> Left, xspeed=yspeed=4 => " + rectangle);
        //System.out.println(rectangle);

        MovableRectangle rnew = (MovableRectangle) rectangle;
        System.out.println("\nNew rectangle - " + rnew);

        rnew.setSpeed (5, 9, 0); // we change speeds of topLeft and downRight points

        System.out.println("New speeds for new rectangle: " + rnew);
        rnew.moveUp();
        System.out.println("\nResult after Up : " + rnew);

    }
}
