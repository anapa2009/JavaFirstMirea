package ru.mirea.task15.opt2;
import java.io.*;

public class ReadFromFile {

    public static void main (String args[]) throws IOException {

        //Определяем файл
        File file = new File ("test.txt");

        try {
            //if (file.exists ()) {
            //проверяем, что файл существует
            InputStream is = new FileInputStream (file);
            System.out.println ();

            int c=0;
            while ((c = is.read()) != -1) {
                char ch = (char) c;
                System.out.print ( ch );
            }
            is.close ();
            //}
        }
        //catch (IOException e) { FileNotFoundException ex
        catch (FileNotFoundException ex) {
            System.out.print ("\nException: file "+file.getName()+" does'n exist");
        }

    }
}