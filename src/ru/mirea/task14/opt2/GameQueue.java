package ru.mirea.task14.opt2;
import java.util.ArrayDeque;
import java.util.Queue;

public class GameQueue {
    Queue <Integer> fpl, spl; //fpl - 1-st player; spl - 2-nd player

    //PriorityQueue <Integer> myPriorityQueue = new PriorityQueue <Integer>();
    //PriorityQueue <Integer> fpl, spl;

    //-----------------------------------------
    public GameQueue (String fpl, String spl) {
        this.fpl = new ArrayDeque <> ();
        this.spl = new ArrayDeque <> ();

        //this.fpl = new PriorityQueue <> ();
        //this.spl = new PriorityQueue <> ();

        for (int i = 0; i < 5; i ++) {
            this.fpl.add (Integer.parseInt (fpl.substring(i, i+1)));
            this.spl.add (Integer.parseInt (spl.substring(i, i+1)));
        }

        System.out.println ("1st player queue : "  + fpl);
        System.out.println ("2nd player queue : "  + spl);
        System.out.println ("------------------------");
    }

    //---------------------
    public String play () {
        int count = 0;
        while ( (!fpl.isEmpty()) && (!spl.isEmpty()) && (count < 106)) {
            if ( (fpl.peek() > spl.peek()) && (spl.peek() != 0) ) {
                fpl.add (fpl.remove());
                fpl.add (spl.remove());
            }
            else {
                spl.add (fpl.remove());
                spl.add (spl.remove());
            }
            count++;
            //System.out.println (count + ", 1st player queue : "  + fpl);
            //System.out.println (count + ", 2nd player queue : "  + spl);
            //System.out.println ("------------------------");
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
