package ru.mirea.task2.opt2;
import java.lang.*;

public class TestBall {

    public static void main (String[] args) {

        Ball bb1 = new Ball (20.0, 200.0, "sphere",
        "football", "red", 300.0);
        Ball bb2 = new Ball ("basketball");
        Ball bb3 = new Ball ();

        String str=bb2.toString ();
        System.out.println("\n"+str+"\n");

        bb1.setMaxBallSize (30.);
        bb1.setBallColor ("yellow");
        System.out.println(bb1);

        str=bb3.toString ();
        System.out.println("\n"+str);
    }
}
