package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramMouse {

    public static void main (String[] args) {

        JFrame myWindow = new SimpleWindowMouse ();

        myWindow.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        myWindow.setVisible (true);
    }
}

