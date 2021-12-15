package ru.mirea.task14.opt4;
import java.util.LinkedList;

public class GameLinkL {
    LinkedList <Integer> fpl, spl;

    //-----------------------------------------
    public GameLinkL (String fpl, String spl) {
        this.fpl = new LinkedList <> ();
        this.spl = new LinkedList <> ();
        for(int i = 0; i < 5; i ++){
            this.fpl.add (Integer.parseInt (fpl.substring (i, i+1)));
            this.spl.add (Integer.parseInt (spl.substring (i, i+1)));
        }
        System.out.println ("\n1st player Linklist : "  + fpl);
        System.out.println (  "2nd player Linklist : "  + spl);
        System.out.println ("---------------------------");
    }


    //---------------------
    public String play () {
        int count = 0;
        while ( (!fpl.isEmpty()) && (!spl.isEmpty()) && (count <= 106) ) {
            if ( (fpl.peek() > spl.peek()) && (spl.peek() != 0) ) {
                fpl.add (fpl.remove());
                fpl.add (spl.remove());
            }
            else {
                spl.add (fpl.remove());
                spl.add (spl.remove());
            }
            count++;
        }

        String res = "";

        if (count <= 106) {
            if (fpl.isEmpty())
                res += "second ";
            else
            if (spl.isEmpty())
                res += "first ";
            res += "; count= " + count;
        } else
            res += "count= " + count + "; botva"; //res += "; botva";
        return res;
    }

}