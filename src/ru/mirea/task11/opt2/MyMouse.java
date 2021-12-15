package ru.mirea.task11.opt2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouse extends JFrame {

//public class MyMouse extends JPanel {

    //JLabel lbl = new JLabel("");
    String ww=" ";
    String wwi=" ";
    //String[] wwName = {"WEST", "EAST", "SOUTH", "NORTH", "CENTER"};

//-----------------------------------------
//   public static void main (String[]args) {
//      new MyMouse().setVisible(true);
//   }

    //--------------------
    public MyMouse () {
        //super ("Studying BorderLayout Manager"); //for window
        //setSize (400,400);

        //super (); //создать панель

        //setLayout (new BorderLayout());

        JPanel[] pnl = new JPanel[5];
        String[] wwName = {"WEST", "EAST", "SOUTH", "NORTH", "CENTER"};

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            //pnl[i].setBackground (new Color(r,g,b));
            //add (pnl[i]);
        }

        //getContentPane().add (pnl[0], BorderLayout.WEST);
        //getContentPane().add (pnl[1], BorderLayout.EAST);
        //getContentPane().add (pnl[2], BorderLayout.SOUTH);
        //getContentPane().add (pnl[3], BorderLayout.NORTH);
        //getContentPane().add (pnl[4], BorderLayout.CENTER);

        add (pnl[0], BorderLayout.WEST);
        add (pnl[1], BorderLayout.EAST);
        add (pnl[2], BorderLayout.SOUTH);
        add (pnl[3], BorderLayout.NORTH);
        add (pnl[4], BorderLayout.CENTER);

        //add (lbl,BorderLayout.SOUTH);

        //ActionListener actionListener = new TestActionListener ();
        //MilanButton.addActionListener (actionListener);

        for (int i = 0; i < pnl.length; i++) {
            //pnl[i].addMouseListener (new CustomListener());
            wwi=wwName[i];
            pnl[i].addMouseListener (new MouseListener() {

                public void mouseExited (MouseEvent a) {}
                public void mouseClicked (MouseEvent a) {
                    //lbl.setText ("X=" + a.getX() + " Y=" + a.getY());
                }
                public void mouseEntered (MouseEvent a) {
                    ww = "Welcome to " + wwi + " panel";
                    //ww="";
                    JOptionPane.showMessageDialog (null,
                            ww,"Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                public void mouseReleased (MouseEvent a) {}
                public void mousePressed (MouseEvent a) {}
            });
        }
    }

}


/*
     //Component.addMouseListener(listener);
     //for (int i = 0; i < pnl.length; i++) {

     addMouseListener (new MouseListener() {

         public void mouseExited (MouseEvent a){}
         public void mouseClicked (MouseEvent a) {
            lbl.setText ("X=" + a.getX() + " Y=" + a.getY());

JOptionPane.showMessageDialog (null,
                 ww,"Alert",JOptionPane.INFORMATION_MESSAGE);
         }
         public void mouseEntered(MouseEvent a) {}
         public void mouseReleased(MouseEvent a) {}
         public void mousePressed(MouseEvent a) {}
      });
   }

   public static void main(String[]args) {
      new MyMouse().setVisible(true);
   }
}
*/
