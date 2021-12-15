package ru.mirea.task8.opt2;
import java.awt.* ;
import javax.swing.*;

public class PaintPicture extends JPanel {
    //Этот класс расширяет класс JPanel.
    //В нем переопределяется метод paintComponent( )
    //чтобы произвольно рисовать линии на панели

    Insets ins ; // служит для хранения размеров границ панели

    //-------------
    PaintPicture () {

        super ();
        //создать панель
        setBorder (BorderFactory.createLineBorder(Color.RED, 5)) ;
        //разместить рамку вокруг панели, определив ее границы

        setSize (300, 300);
    }



    //--------------------------------------------
    protected void paintComponent (Graphics g) {
        //переопределить метод paintComponent()

        super.paintComponent(g);
        //вызывать всегда первым метод из суперкласса

        String filename = "pict2.jpg";
        //Image image = ImageIO.read(new File("C:/Users/user/Desktop/photo/pict2.jpg"));


        //public void paintComponent (Graphics g) {
        Image image = new ImageIcon("C:/Users/user/Desktop/photo/pict2.jpg").getImage();
        //g.drawImage(image, 3, 4, this);
        g.drawImage(image, 1, 1, null);
    }

}
