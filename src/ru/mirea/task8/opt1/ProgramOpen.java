package ru.mirea.task8.opt1;
import javax.swing.*;

public class ProgramOpen {
    public static void main(String[] args) {

        JFrame myWindow = new SimpleWindow();

        //JPanel myPanel = new PaintPanel ();
        PaintPanel myPanel = new PaintPanel();

        myWindow.add(myPanel);

        myWindow.setVisible(true);
    }
}