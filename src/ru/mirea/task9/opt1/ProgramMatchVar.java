package ru.mirea.task9.opt1;
import javax.swing.*;

public class ProgramMatchVar {

    public static void main (String[] args) {

        JFrame myWindow = new SimpleWindowMatch ();

        MatchVar myPanel = new MatchVar ();

        myWindow.add (myPanel);

        myWindow.setVisible (true);

    }
}


