package ru.mirea.task14.opt3;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class GameDeque {
    Deque <Integer> fpl, spl; //fpl - 1-st player; spl - 2-nd player

    //--------------------------------------------
    public GameDeque (String fpl, String spl) {
        this.fpl = new ArrayDeque <> ();
        this.spl = new ArrayDeque <> ();
        for (int i = 0; i < 5; i ++) {
            this.fpl.add (Integer.parseInt (fpl.substring (i, i+1)));
            this.spl.add (Integer.parseInt (spl.substring (i, i+1)));
        }
        System.out.println ("\n1st player decue : "  + fpl);
        System.out.println (  "2nd player decue : "  + spl);
        System.out.println ("------------------------");
    }

    //------------------------
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