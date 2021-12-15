package ru.mirea.task14.opt3;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class TestGameDeque {
    Deque<Integer> fpl, spl;

    public TestGameDeque (String fpl, String spl) {
        this.fpl = new ArrayDeque <> ();
        this.spl = new ArrayDeque <> ();
        for (int i = 0; i < 5; i ++) {
            this.fpl.add (Integer.parseInt(fpl.substring(i, i+1)));
            this.spl.add (Integer.parseInt(spl.substring(i, i+1)));
        }
    }

    public String play () {
        int count = 0;
        while(!fpl.isEmpty() && !spl.isEmpty() && count <= 106){
            if(fpl.peek() > spl.peek()
                    && spl.peek() != 0){
                fpl.add(fpl.remove());
                fpl.add(spl.remove());

            }else{
                spl.add(fpl.remove());
                spl.add(spl.remove());
            }
            count++;
        }
        String res = "";
        if(fpl.isEmpty()) res += "second ";
        else if (spl.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new TestGameDeque("13579", "24680").play());
        System.out.println(new TestGameDeque("12345", "67890").play());
        System.out.println(new TestGameDeque("13029", "42685").play());
    }

}