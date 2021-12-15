package ru.mirea.task8.opt3;
import java.awt.*;

public class SimpleAnim extends Frame {
    private Image[] img = new Image[5];
    private int count;

    SimpleAnim (String s) {
        super (s);
        setLocationRelativeTo(null);
        MediaTracker tr = new MediaTracker (this);
        for (int k = 0; k < 5; k++) {
            img[k] = getToolkit().getImage ("C:\\Users\\user\\Desktop\\photo\\pict" + (k + 1) + ".jpg");
            tr.addImage(img[k], 0);
        }
        try {
            tr.waitForAll (); // Ждем загрузки всех изображений
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        setSize (400, 300);
        setVisible (true);
    }
    public void paint (Graphics g) {
        g.drawImage (img[count % 5], 0, 0, this);
    }

    //public void update(Graphics g) { paint(g); }

    public void go () {
        while (count < 100) {
            repaint(); // Выводим следующий кадр
            try { //Задержка в 0.1 сек
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            count++;
        }
    }


}
