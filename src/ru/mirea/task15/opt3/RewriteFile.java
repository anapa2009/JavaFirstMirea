package ru.mirea.task15.opt3;
import java.io.*;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class RewriteFile {

    public static void main (String args[]) throws IOException {

        InputStreamReader cin = null;

        //Определяем файл
        File file = new File ("test.txt");

        OutputStream os = new FileOutputStream (file);
        cin = new InputStreamReader (System.in);

        try {
            System.out.println ("\nEnter characters, '+' to quit:");
            char c;
            do {
                c = (char) cin.read ();
                os.write ( c );
                //System.out.print (c);

            } while (c != '+');
        }
        finally {
            if (cin != null) {
                cin.close ();
                os.close();
            }
        }

    }
}