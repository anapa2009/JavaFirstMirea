package ru.mirea.task8.opt3;

import java.awt.event.*;

public class ProgramAnim {

    public static void main (String[] args) {
        SimpleAnim f = new SimpleAnim (" Простая анимация");
        f.go ();
        f.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent ev) {
                System.exit (0);
            }
        });
    }
}
