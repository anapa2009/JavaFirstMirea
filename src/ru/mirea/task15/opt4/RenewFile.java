package ru.mirea.task15.opt4;
import java.io.*;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;


public class RenewFile {

    public static void main (String args[]) throws IOException {

        InputStreamReader cin = null;

        //Определяем файл
        File file = new File ("test.txt");

        OutputStream os = null;

        try {
            //в конструкторе FileOutputStream используем флаг true,
            //который обозначает дозапись содержимого файла

            os = new FileOutputStream (file, true);
            //FileOutputStream (File fileObj, boolean append)

            cin = new InputStreamReader (System.in);

            if (file.length() > 0)
                os.write (10);
            //чтобы добавить разрыв строки, используйте
            //fileOutputStream.write (10); потому что десятичное
            //значение 10 представляет новую строку в ASCII

            System.out.println ("\nEnter characters, '+' to quit:");
            char c;
            do {
                c = (char) cin.read ();
                if (c != '+')
                    os.write ( c );
                //System.out.print (c);

            } while (c != '+');

            //os.write (data.getBytes(), 0, data.length());
        }
        catch (IOException e) {
            e.printStackTrace ();
        }
        finally {
            try {
                if (cin != null)
                    cin.close ();
                if (os != null)
                    os.close ();
            }
            catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
}