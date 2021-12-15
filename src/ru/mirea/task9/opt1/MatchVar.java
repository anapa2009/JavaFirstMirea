package ru.mirea.task9.opt1;
import javax.swing.*;
import java.awt.event.*;

public class MatchVar extends JPanel {

    private JButton MilanButton;
    private JButton MadridButton;
    private JLabel lastScoreLabel;
    private JLabel resLabel;
    private JLabel winLabel;

    public int mil = 0, madr = 0;

    public String ww = "DRAW";
    public String last=" ";

    public  MatchVar () {

        super (); //создать панель


        setSize (430, 100);

        MilanButton = new JButton ("Milan");
        MilanButton.setActionCommand ("Milan + 1");
        add (MilanButton);

        MadridButton = new JButton ("Madrid");
        MadridButton.setActionCommand ("Madrid + 1");
        add (MadridButton);

        lastScoreLabel = new JLabel ("Last Score: "); //lastScoreLabel;
        add (lastScoreLabel);

        resLabel = new JLabel ("Result: ");
        add (resLabel);

        winLabel = new JLabel ("Winner: ");
        add (winLabel);

        ActionListener actionListener = new TestActionListener ();

        MilanButton.addActionListener (actionListener);
        MadridButton.addActionListener (actionListener);

    }

    private void mouseUp (String last) {
        lastScoreLabel.setText ("Last Score: " + last + "  ");

        if (MilanButton.getX() < MadridButton.getX())
            resLabel.setText ("Result: " + String.valueOf(mil) + " X "
                    + String.valueOf(madr) + "  ");
        else
            resLabel.setText ("Result: " + String.valueOf(madr) + " X "
                    + String.valueOf(mil) + "  ");

        ww = "DRAW";
        if (mil > madr)
            ww = "Milan ";
        else   if (madr > mil)
            ww = "Madrid";
        if (mil == madr)
            winLabel.setText ("No winner " + "        ");
        else
            winLabel.setText ("Winner :  " + ww + "  ");

    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            String last=" ";

            JButton button = (JButton) e.getSource();  //источник события

            System.out.println (button.getText() + ", " +
                    e.getActionCommand());

            if (button == MilanButton) {
                last="Milan" ;
                mil++;
                MilanButton.setText ("Milan + 1 ");
                MadridButton.setText ("Madrid    ");
            }
            //if (e.getSource() == MadridButton) {
            if (button == MadridButton) {
                last="Madrid" ;
                madr++;
                MilanButton.setText ("Milan     ");
                MadridButton.setText ("Madrid + 1");
            }

            mouseUp (last);

        }
    }
}

