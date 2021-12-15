package ru.mirea.task14.opt2;

public class TestGameQueue {

    public static void main (String[] args) {
        System.out.println (new GameQueue ("13579", "24680").play());
        System.out.println (new GameQueue ("12345", "67890").play());
        System.out.println (new GameQueue ("23579", "14680").play());
        System.out.println (new GameQueue ("52603", "81479").play());
        System.out.println (new GameQueue ("81479", "52603").play());
    }
}
