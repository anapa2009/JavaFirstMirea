package ru.mirea.task4.opt2;
import java.lang.*;

public class TestBallNew {

    public static void main (String[] args) {

        // Создаем экземпляр класса BallNew
        BallNew ball = new BallNew(1, 1);
        System.out.println(ball);

        ball.setX(2);
        ball.setY(2);
        System.out.println(ball.getX());
        System.out.println(ball.getY());

        ball.setXY(3.0,3.0);
        System.out.println(ball);


        // Передвигаем объект на 5 точек по осям x и y
        ball.move(5, 5);
        System.out.println(ball);

    }
}