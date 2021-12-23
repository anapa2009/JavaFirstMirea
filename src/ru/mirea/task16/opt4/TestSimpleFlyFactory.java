package ru.mirea.task16.opt4;
import java.util.*;


public class TestSimpleFlyFactory {
    //простой заводской тест

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




    public static void main (String [] args) {

        String[] townItems = {"TownA", "TownB", "TownC", "TownD"};
        String[] flyItems = new String [2*townItems.length];


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

                System.out.println (route.toString());
                System.out.println (routeInv.toString());
            }
        }
        catch (Exception ex) {
            System.err.println (ex.getMessage ());
        }

        //------------------------------------------
        //*/


    }
}