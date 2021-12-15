package ru.mirea.task15.opt1;
import java.io.*;

public class ReadConsole {

    public static void main (String args[]) throws IOException {
        InputStreamReader cin = null;

        //Определяем файл
        File file = new File ("test.txt");
        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists ()) {
                file.createNewFile ();
            }
        }
        finally {
        }
        OutputStream os = new FileOutputStream (file); //("test.txt");

        try {
            cin = new InputStreamReader (System.in);
            System.out.println ("\nEnter characters, '+' to quit.");
            char c;
            do {
                c = (char) cin.read ();
                if (c != '+')
                    os.write ( c );

                //System.out.print (c);
            } while (c != '+');
        }
        finally {
            if (cin != null)
                cin.close ();
            if (os != null)
                os.close();
        }
    }
}