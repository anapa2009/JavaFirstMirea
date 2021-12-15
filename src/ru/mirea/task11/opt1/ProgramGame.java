package ru.mirea.task11.opt1;

import javax.swing.*;
import java.util.Random;

public class ProgramGame {

    public static void main (String[] args) {

        JFrame myWindow = new SimpleWindowGame ();

        Random r = new Random ();
        int min=0;
        int max=20;
        int randInt = r.nextInt (max - min) + min;
        //число randInt надо отгадать;

        MyGame myPanel = new MyGame (randInt);
        //MatchVar myPanel = new MatchVar ();

        myWindow.add (myPanel);

        myWindow.setVisible (true);

    }
}

