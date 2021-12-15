package ru.mirea.task11.opt2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleWindowMouse extends JFrame {

    private JPanel pnlNorth;
    private JPanel pnlSouth;
    private JPanel pnlEast;
    private JPanel pnlWest;
    private JPanel pnlCenter;

    private JLabel labelNorth;
    private JLabel labelSouth;
    private JLabel labelEast;
    private JLabel labelWest;
    private JLabel eventLabel;

    String text = " ";
    String ww=" ";
    String wwi=" ";

    SimpleWindowMouse () {
        super ("Studying BorderLayout Manager");

        setDefaultCloseOperation (EXIT_ON_CLOSE);
        //setSize (430, 100);
        setSize (400,400);

        setLocationRelativeTo (null);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());

        pnlNorth = new JPanel();
        pnlSouth = new JPanel();
        pnlEast = new JPanel();
        pnlWest = new JPanel();
        pnlCenter = new JPanel();

        String[] wwName = {"WEST", "EAST", "SOUTH", "NORTH", "CENTER"};

        labelNorth = new JLabel ("North");
        pnlNorth.add (labelNorth);

        labelSouth = new JLabel ("South");
        pnlSouth.add (labelSouth);

        labelEast = new JLabel ("East");
        pnlEast.add (labelEast);

        labelWest = new JLabel ("West");
        pnlWest.add (labelWest);

        eventLabel = new JLabel ("Event");
        pnlCenter.add (eventLabel);

        myPanel.add (pnlWest, BorderLayout.WEST);
        myPanel.add (pnlEast, BorderLayout.EAST);
        myPanel.add (pnlSouth, BorderLayout.SOUTH);
        myPanel.add (pnlNorth, BorderLayout.NORTH);
        myPanel.add (pnlCenter, BorderLayout.CENTER);

        pnlNorth.setPreferredSize(new Dimension(400,50));
        pnlSouth.setPreferredSize(new Dimension(400,50));
        pnlWest.setPreferredSize(new Dimension(50,300));
        pnlEast.setPreferredSize(new Dimension(50,300));

        pnlCenter.setBackground(Color.green);

        pnlNorth.addMouseListener (new CustomMouseListener());
        pnlSouth.addMouseListener (new CustomMouseListener());
        pnlWest.addMouseListener (new CustomMouseListener());
        pnlEast.addMouseListener (new CustomMouseListener());
        pnlCenter.addMouseListener (new CustomMouseListener());

        pnlNorth.setMinimumSize (pnlNorth.getPreferredSize());
        pnlSouth.setMinimumSize (pnlSouth.getPreferredSize());
        pnlWest.setMinimumSize (pnlWest.getPreferredSize());
        pnlEast.setMinimumSize (pnlEast.getPreferredSize());

        super.getContentPane().add(myPanel);

    }

    //=====================================================
    class CustomMouseListener implements MouseListener {
        public void mouseClicked (MouseEvent e) {
        }
        public void mousePressed (MouseEvent e) {
        }
        public void mouseReleased (MouseEvent e) {
        }
        public void mouseEntered (MouseEvent e) {
            JPanel panel = (JPanel) e.getSource();  //источник события

            if (panel==pnlNorth)
                wwi="NORTH";
            if (panel==pnlSouth)
                wwi="SOUTH";
            if (panel==pnlNorth)
                wwi="NORTH";
            if (panel==pnlEast)
                wwi="EAST";
            if (panel==pnlWest)
                wwi="WEST";
            if (panel==pnlCenter)
                wwi="CENTER";

            String text = "mouseEntered in " + wwi;
            eventLabel.setText (text);

            ww = "Welcome to " + wwi + " panel";

            //ww="";
            JOptionPane.showMessageDialog (null,
                    ww,"Message",JOptionPane.INFORMATION_MESSAGE);
        }
        public void mouseExited (MouseEvent e) {
        }
    }


}