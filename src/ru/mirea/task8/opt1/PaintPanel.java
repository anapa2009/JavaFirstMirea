package ru.mirea.task8.opt1;
import java.awt.* ;
import javax.swing.*;
import java.util.*;

import java.lang.Math;
import java.awt.Color;

public class PaintPanel extends JPanel {
    //Этот класс расширяет класс JPanel.
    //В нем переопределяется метод paintComponent( ) ,
    //чтобы произвольно рисовать линии на панели

    Insets ins ; // служит для хранения размеров границ панели
    Random rand; // служит для генерирования случайных чисел

    //public String[] mColors {"red", "blue", "green","orange", "magenda", "cyan"};
    Color[] mColors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE,
            Color.PINK, Color.CYAN, Color.GRAY};

/*
   public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
*/

    //-------------
    PaintPanel () {

        super ();
        //создать панель
        setBorder (BorderFactory.createLineBorder(Color.RED, 5)) ;
        //разместить рамку вокруг панели, определив ее границы
        rand = new Random();

        setSize (250, 100);
        //setDefaultCloseOperation (EXIT_ON_CLOSE);
    }


    //-------------------------
    public Color getColorRand () {
        //String color = "";
        Color newColor = null;

        //Randomly select a color
        Random randomColor = new Random();
        int randomNumber = randomColor.nextInt(mColors.length);

        newColor = mColors[randomNumber];
        //int colorInt = Color.parseColor(color);

        return newColor;
    }


    //--------------------------------------------
    protected void paintComponent (Graphics g) {
        //protected void paint (Graphics g) {
        //переопределить метод paint Component()

        super.paintComponent(g);
        //вызывать всегда первым метод из суперкласса

        int x, y, x2, y2;
        int numForma = 0;
        int xLeft = 0;
        int yUp = 0;
        int colorInt = 0;
        //String color = "";

        //получить высоту и ширину компонента
        int height = getHeight();
        int width = getWidth();

        //получить размеры границ панели
        ins = getInsets();

        //нарисовать фигуры

        for (int i=0; i < 20; i++) {
            //получить произвольные координаты,
            //определяющие размеры и положения каждой фигуры

            x = rand.nextInt(width-ins.left);
            y = rand.nextInt(height-ins.bottom);
            x2 = rand.nextInt(width-ins.left);
            y2 = rand.nextInt(height-ins.bottom);

            xLeft = Math.min(x, x2); //положение левой точки
            yUp = Math.max(y,y2);  //положение верхней точки
            x2 = Math.abs(x-x2); //ширина фигуры
            y2 = Math.abs(y-y2); //высота фигуры

            //int randomNumber = (int)(Math.random() * (max + 1 - min) + min);

            numForma = rand.nextInt(3); //случайный выбор вида кривой

            //int randomNumber = randomColor.nextInt(mColors.length);
            int randomNumber = rand.nextInt(mColors.length);

            //int colorInt = mColors[randomNumber]; //getColor();
            //g.setColor(colorInt); //задаем цвет случайным образом

            g.setColor(getColorRand ()); //задаем цвет случайным образом

            //нарисовать линию
            //g.drawLine(x, у, х2, у2);

            switch (numForma) {
                case 0: //Rectangle2D
                    g.drawRect(xLeft, yUp, x2, y2);
                    break;
                case 1: //Square2D
                    g.drawRect(xLeft, yUp, x2, x2);
                    break;
                case 2: //Oval2D
                    g.drawOval(x, y, x2, y2);
                    break;
                case 3: //Circle2D
                    g.drawOval(x, y, x2, x2);
                    break;
            }
        }
    }
}
