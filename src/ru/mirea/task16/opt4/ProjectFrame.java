package ru.mirea.task16.opt4;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.util.Random;
//import java.lang.Math;
//import java.util.Stack;

//import mypackage.EnumValues;
//import static mypackage.EnumValues.FlyTowns.*;

//import java.util.function.Function;

//---------------------------------------------------
enum FlyTowns {           //список пунктов прилета
    TOWNA ("TownA"), TOWNB ("TownB"), TOWNC ("TownC"),
    TOWND ("TownD");

    //public static final String [] names = new String [values().length];
    //static {
    //   FlyTowns[] values = values();
    //   for (int i=0; i<values.length; i++)
    //      names[i]=values[i].name();
    //}

    private final String town;

    FlyTowns (String town) {
        this.town = town;
    }

    public String getTown () {
        return town;
    }

    //Возвращает это имя модификатора в нижнем регистре.
    //@Override
    //public String toString() {
    //   //String town = name().toLowerCase(java.util.Locale.US);
    //   String town = name().java.util.Locale.US;
    //   return town;
    //}

}
//---------------------------------------------------------


public class ProjectFrame extends JFrame {

    int rwork = 0; //setting work regime (0 - client, 1 - admin)

    public FlyTowns TOWNA, TOWNB, TOWNC, TOWND;

    //FlyTowns

    //======================
    public ProjectFrame () {

        super ("My Project");

        setSize (480, 140);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

        JPanel myPanel = new JPanel ();
        myPanel.setLayout (new BorderLayout ());

        JPanel pnlNorth = new JPanel ();
        JPanel pnlSouth = new JPanel ();
        JPanel pnlEast = new JPanel ();
        JPanel pnlWest = new JPanel ();
        JPanel pnlCenter = new JPanel ();

        myPanel.add (pnlWest, BorderLayout.WEST);
        myPanel.add (pnlEast, BorderLayout.EAST);
        myPanel.add (pnlSouth, BorderLayout.SOUTH);
        myPanel.add (pnlNorth, BorderLayout.NORTH);
        myPanel.add (pnlCenter, BorderLayout.CENTER);


        JLabel start = new JLabel ("Режим работы        ");
        pnlNorth.add (start);


        JButton clientButton = new JButton ("Client");
        //ClientButton.setActionCommand ("Milan + 1");
        pnlNorth.add (clientButton);

        JButton adminButton = new JButton ("Admin ");
        //MadridButton.setActionCommand ("Madrid + 1");
        pnlNorth.add (adminButton);

        JButton resetButton = new JButton ("ResetWork ");
        //MadridButton.setActionCommand ("Madrid + 1");
        pnlNorth.add (resetButton);

        JPanel pnlCenter1 = new JPanel ();
        pnlCenter.add (pnlCenter1);

        JPanel pnlCenter2 = new JPanel ();
        pnlCenter.add (pnlCenter2);


        //ActionListener actionListener = new TestActionListener ();
        //clientButton.addActionListener (actionListener);
        //adminButton.addActionListener (actionListener);


        clientButton.addActionListener (e -> {
            if (rwork<2) {
                clientButton.setEnabled (true);
                adminButton.setEnabled (false);
                rwork = 1; //set up client regime
                start.setText ("Режим работы: клиент");
                pnlWest.setVisible (true);
            }
            //if (!(adminButton.isEnabled ())) {
            //if (!(clientButton.isEnabled ())) {
        });


        adminButton.addActionListener (e -> {
            if (!(rwork==1)) {
                adminButton.setEnabled (true);
                clientButton.setEnabled (false);
                rwork = 2; //set up admin regime
                start.setText ("Режим работы: админ ");
            }
        });

        resetButton.addActionListener (e -> {
            adminButton.setEnabled (true);
            clientButton.setEnabled (true);
            rwork = 0; //reset regime of work
            start.setText ("Режим работы:       ");

            pnlWest.setVisible (false);
            pnlCenter1.setVisible (false);
            pnlCenter2.setVisible (false);
        });


        add (myPanel);


        //----------------------------------------------------------------
        String[] actItems = {"пункт прилета", "выбрать маршрут и рейс",
                "купить билет", "сдать билет"};

        String[] townItems = {"TownA", "TownB", "TownC", "TownD"};

        String[] flyItems = {"MyTown - TownA", "TownA - MyTown",
                "MyTown - TownB", "TownB - MyTown",
                "MyTown - TownC", "TownC - MyTown",
                "MyTown - TownD", "TownD - MyTown"};

        ///*
        //------------------------------------------

        InterfRoute route =null; //= new InterfRoute ();
        InterfRoute routeInv =null;

        String town=null;

        try {
            //создание простой фабрики
            MyFlyFactory factory = new MyFlyFactory ();

            for (int i = 0; i < townItems.length; i++) {
                int ii = i;
                switch (ii) {
                    case 0: //TownA:
                        town = FlyTowns.TOWNA.getTown ();
                        //route = factory.getRouteName (townItems[i]);
                        break;
                    case 1: //TownB:
                        town = FlyTowns.TOWNB.getTown ();
                        break;
                    case 2:  //TownC:
                        town = FlyTowns.TOWNC.getTown ();
                        break;
                    case 3:  //TownD:
                        town = FlyTowns.TOWND.getTown ();
                }
                factory.setCode (0); //direct fly;
                route = factory.outputRouteName (town);
                factory.setCode (1); //return fly;
                routeInv = factory.outputRouteName (town);

                flyItems[2*i] = route.toString(); //direct route;
                flyItems[2*i+1] = routeInv.toString(); //return route;
            }
        }
        catch (Exception ex) {
            System.err.println (ex.getMessage ());
        }

        //------------------------------------------
        //*/

      /*
      Function routeDirect = new RouteDirect ();
      Function routeReturn = new RouteReturn ();
      String townTarget = null;
      //String result = route.apply ((String) )
      //Long result = adder.apply((long) 4);


      for (int i = 0; i < townItems.length; i++) {
         townTarget = (String) townItems [i];
         //flyItems[2*i] = routeDirect.apply ((String) townTarget);
         //flyItems[2*i+1] = routeReturn ((String) townTarget);

         flyItems[2*i] = routeDirect.apply (townTarget);
         flyItems[2*i+1] = routeReturn (townTarget);
      }
      */

        //----------------------------------------------------------------

        JComboBox <String> actBox1 = new JComboBox <> (actItems);
        actBox1.setSelectedIndex(0);
        //выбирается элемент JComboBox  с индексом 0

        pnlWest.add (actBox1);
        pnlWest.setVisible (false);

        JLabel punktPrileta = new JLabel ("Выбрать пункт прилета");
        pnlCenter1.add (punktPrileta);
        pnlCenter1.setLayout (new BoxLayout (pnlCenter1, BoxLayout.Y_AXIS));

        JLabel myRoute = new JLabel ("Выбрать маршрут      ");
        pnlCenter2.add (myRoute);
        pnlCenter2.setLayout (new BoxLayout (pnlCenter2, BoxLayout.Y_AXIS));

        //String[] townItems = Arrays.toString (FlyTowns.values());
        //int ii=-1;
        //for (FlyTowns tt : FlyTowns.values()) {
        //   ii++;
        //   townItems [ii] = this.getTown(); //FlyTowns.tt.getTown();
        //}


        JComboBox <String> actBox2 = new JComboBox <> (townItems);

        actBox2.setSelectedIndex(0);
        //выбирается элемент JComboBox с индексом 0

        pnlCenter1.add (actBox2);
        pnlCenter1.setVisible (false);

        JComboBox <String> actBox3 = new JComboBox <> (flyItems);

        //Сформировать flyItems
        //CarType dev = CarType.valueOf ("BUS");


        //JComboBox <String> actBox3 = new JComboBox <> (flyItems);
        actBox3.setSelectedIndex(0);
        //выбирается элемент JComboBox с индексом 0

        pnlCenter2.add (actBox3);
        pnlCenter2.add (actBox3);
        pnlCenter2.setVisible (false);

        actBox1.addItemListener (e -> {
            //Color c;
            switch (actBox1.getSelectedIndex()) {
                case 0:
                    pnlCenter1.setVisible (true); //(false);
                    break;
                case 1:
                    pnlCenter2.setVisible (true); //(false);
                    break;
                case 2:
                    //c = Color.BLUE;
                    pnlCenter1.setVisible (false);
                    pnlCenter2.setVisible (false);
                    break;
                default:
                    //c = Color.BLACK;
            }
            //textArea.setForeground(c);
        });

    }
}