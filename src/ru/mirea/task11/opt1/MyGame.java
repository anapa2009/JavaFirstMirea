package ru.mirea.task11.opt1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGame extends JPanel {
    int clk=0; //to calculate amount of clicks on button

    //JTextField jta = new JTextField ("Input number (0..20)",30);
    JTextField jta = new JTextField (2);

    JButton button = new JButton ("Click here");
    Font fnt = new Font ("Times new roman",Font.BOLD,20);

    String ww = "Number";

    //-------------------------------------------
    MyGame (int randInt) {

        add (jta); //add JTextField jta
        jta.setForeground (Color.PINK);
        jta.setFont (fnt);

        jta.setHorizontalAlignment(JTextField.RIGHT);
        jta.setToolTipText("Input number (0..20)");


        add (button); //JButton button

        button.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                clk++;
                //System.out.println ("Amount of clicks= " + clk );
                button.setText ("Click # " + clk);

                try {
                    int x =
                            Integer.parseInt(jta.getText().trim());

                    if (x==randInt)
                        ww = "Congradulations: You are Winner !";
                    else {
                        if ((x<0)|(x>20)) {
                            ww="Number entered is out of range 0..20";
                            JOptionPane.showMessageDialog (null, ww,
                                    "alert", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        else {
                            ww = "Number entered is less than hidden one";
                            if (x>randInt)
                                ww = "Number entered is greater than hidden one";
                        }
                    }

                    switch (clk) {
                        case 1: //1-st and 2-nd clicks: set number
                        case 2: {
                            ww = ww + ", number = " + Integer.toString(x);
                            break;
                        }
                        case 3: { //3-d click: set number
                            ww="Game is over";
                            //return;
                            break;
                        }
                    }

                    JOptionPane.showMessageDialog (null,
                            ww,"Alert",JOptionPane.INFORMATION_MESSAGE);

                    if (clk==3) {
                        //myWindow.dispose();
                        System.exit(0);
                    }

                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog (null,
                            "Error in Number !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible (true);
    }
}

