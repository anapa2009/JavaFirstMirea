package ru.mirea.task14.opt4;
import java.util.LinkedList;

public class TestGameLinkL {

    public static void main (String[] args) {
        System.out.println (new GameLinkL ("13579", "24680").play());
        System.out.println (new GameLinkL ("12345", "67890").play());
        System.out.println (new GameLinkL ("23579", "14680").play());
        System.out.println (new GameLinkL ("52603", "81479").play());
        System.out.println (new GameLinkL ("81479", "52603").play());
    }
}