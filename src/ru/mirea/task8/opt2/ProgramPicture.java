package ru.mirea.task8.opt2;
import javax.swing.*;
public class ProgramPicture {

    public static void main (String [] args) {

        JFrame myWindow = new SimpleWindowPicture ();

        PaintPicture myPanel = new PaintPicture ();

        myWindow.add (myPanel);

        myWindow.setVisible (true);
    }
}
