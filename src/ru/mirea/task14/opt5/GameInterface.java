package ru.mirea.task14.opt5;
import javax.swing.*;
import java.awt.*;

import java.util.*;
import java.util.Random;
import java.lang.Math;
import java.util.Stack;


public class GameInterface extends JFrame {

    //-----------------------
    public GameInterface () {
        super ("Игра");

        setSize (480, 140);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle (arr); //делаем случайную перестановку массива

        //Stack <Integer> nums;
        //nums = new Stack <> ();
        Stack <Integer> nums = new Stack <> ();

        for (int i = 0; i < arr.length; i++)
            nums.push (arr[i]);

        JLabel firstStart = new JLabel (),
                secondStart = new JLabel (),
                curAdd = new JLabel ((nums.peek ()).toString());
        //curAdd = new JLabel ("0");
        //curAdd.setText ((nums.peek ()).toString());

        JPanel p = new JPanel ();
        BoxLayout b = new BoxLayout (p, BoxLayout.Y_AXIS);
        p.setLayout (b);

        JButton addFirst = new JButton ("Первому!"),
                addSecond = new JButton ("Второму!"),
                playButton = new JButton ("Можно играть");
        p.add (addFirst);
        p.add (addSecond);

        JPanel p1 = new JPanel ();
        p1.add (new JLabel ("Первый игрок:"));
        p1.add (firstStart);

        JPanel p2 = new JPanel ();
        p2.add (new JLabel ("Второй игрок:"));
        p2.add (secondStart);

        JPanel p3 = new JPanel ();
        p3.add (new JLabel ("Кому выдать карту: "));
        p3.add (curAdd);

        getContentPane().add (p1, BorderLayout.NORTH);
        getContentPane().add (p2, BorderLayout.SOUTH);
        getContentPane().add (p3, BorderLayout.CENTER);
        getContentPane().add (p, BorderLayout.EAST);
        getContentPane().add (playButton, BorderLayout.WEST);

        playButton.setEnabled (false);


        addFirst.addActionListener (e -> {
            if (!nums.isEmpty ())
                curAdd.setText ((nums.pop ()).toString());

            firstStart.setText (firstStart.getText() + curAdd.getText());
            //добавление карты 1-му игроку
            //curAdd.setText ((new Integer (Integer.parseInt (curAdd.getText())+1)).toString());

            if (firstStart.getText().length() == 5) {
                addFirst.setEnabled (false);
                if (secondStart.getText().length() == 5) {
                    playButton.setEnabled (true);
                    //можно играть, когда у игроков по 5 карт ровно
                }
            }
        });
        addSecond.addActionListener (e -> {
            if (!nums.isEmpty ())
                curAdd.setText ((nums.pop ()).toString());

            secondStart.setText (secondStart.getText() + curAdd.getText());
            //добавление карты 2-му игроку
            //curAdd.setText ((new Integer (Integer.parseInt (curAdd.getText())+1)).toString());

            if (secondStart.getText().length() == 5) {
                addSecond.setEnabled (false);
                if (firstStart.getText().length() == 5) {
                    playButton.setEnabled (true);
                }
            }
        });

        playButton.addActionListener (e -> {
            //JOptionPane.showMessageDialog
            //           (this, new GameStackInterface (firstStart.getText(), secondStart.getText()).play());

            JOptionPane.showMessageDialog (this,
                    new GameStackInterface (firstStart.getText(), secondStart.getText()).play(),
                    "Result",JOptionPane.INFORMATION_MESSAGE);

            firstStart.setText ("");
            secondStart.setText ("");
            //curAdd.setText ("0");

            addFirst.setEnabled (true);
            addSecond.setEnabled (true);
            playButton.setEnabled (false);

            shuffle (arr);
            for (int i = 0; i < arr.length; i++)
                nums.push (arr[i]);
            curAdd.setText ((nums.peek ()).toString());
        });
    }


    //--------------------------------
    private int shuffle (int [] arr) {
        //случайная перестановка массива
        double jd=0.;
        int j=0;
        int temp=0;

        Arrays.sort (arr);

        for (int i = arr.length - 1; i > 0; i--) {
            jd = Math.floor (Math.random()*(i + 1));
            j=(int)jd;
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return 0; //arr;
    }

}