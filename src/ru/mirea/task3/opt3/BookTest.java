package ru.mirea.task3.opt3;
import java.util.Scanner; // импортируем класс
public class BookTest {

    public static void main(String[] args) { // Execution entry point

        // Construct an instance of the Book class called b1
        Book b1 = new Book ("Пушкин А. С.", "Евгений Онегин", 1950, 220);

        String authorStr = b1.getAuthor ();
        String titleStr = b1.getTitle ();
        String yearStr = String.format ("%4d", b1.getYearBook ());
        String pagesStr = String.format ("%4d", b1.getPagesBook ());

        System.out.println ("Book: " + authorStr + "; " + titleStr + "; "
                + "publication year: " + yearStr + " ; pages: " + pagesStr);


        Scanner sc = new Scanner(System.in);
        // создаём объект класса Scanner
        int n = 1;
        System.out.print ("Введите целое число (количество книг n, n>=1): ");

        if (sc.hasNextInt()) {
            // возвращает истину если с потока ввода можно считать
            //целое число

            n = sc.nextInt(); // считываем целое число с потока ввода
            // и сохраняем в переменную i
            //System.out.println (n);
        } else {
            System.out.println ("Неверно введено число n (количество книг) - это не целое число.");
            return;
        }
        if (n<1) {
            System.out.println ("Введено значение n<1 (количество книг).");
            return;
        }

        //-------------------------------
        BookShelf polka = new BookShelf();
        polka.setAmountBooks(n); //booksAmount = n;
        Book[] arr = new Book[n];

        int ii=0;
        String str0;

        for (int i = 0; i < n; i++) {
            arr[i] = new Book();

            String str = String.format ("%2d", (i+1));
            System.out.println (" ");
            System.out.println ("Введите информацию о книге № " + str + ": ");

            System.out.print ("Автор книги: ");
            str=sc.next(); //= console.nextLine();
            str0=sc.nextLine(); //= console.nextLine();
            //System.out.println (str + str0);
            str=str + str0;
            //System.out.print (str);
            arr[i].setAuthor (str); // (sc.nextLine());

            System.out.print ("Название книги: ");
            str=sc.next(); //= console.nextLine();
            str0=sc.nextLine(); //= console.nextLine();
            //System.out.println (str + str0);
            str=str + str0;
            //System.out.println (str);
            arr[i].setTitle (str); // (sc.nextLine());

            System.out.print ("Год издания книги: ");
            if (sc.hasNextInt()) {
                // возвращает истину если с потока ввода можно считать целое число
                ii = sc.nextInt();
                arr[i].setYearBook (ii); // (sc.nextInt()); // считываем целое число с потока ввода
            } else {
                System.out.println ("Неверно введен год издания книги- это не целое число.");
                return;
            }
            System.out.print ("Количество страниц в книге: ");
            if (sc.hasNextInt()) {
                // возвращает истину если с потока ввода можно считать целое число
                ii = sc.nextInt();
                arr[i].setPagesBook (ii); // (sc.nextInt()); // считываем целое число с потока ввода
            } else {
                System.out.println ("Неверно введен год издания книги- это не целое число.");
                return;
            }

            //System.out.print(arr[i] + " ");
            authorStr = arr[i].getAuthor ();
            titleStr = arr[i].getTitle ();
            yearStr = String.format ("%4d", arr[i].getYearBook ());
            pagesStr = String.format ("%4d", arr[i].getPagesBook ());

            System.out.println ("Book: " + authorStr + "; " + titleStr + "; "
                    + "publication year: " + yearStr + " ; pages: " + pagesStr);
            //System.out.println (arr[i].toString());
        }

        //---------------------------
        polka.setArrBooks (arr);
        polka.getAmountBooks ();

        polka.getListOfBooks ();
        polka.getYearsDiapazon ();
        polka.sortByYearsBooks ();
    }
}
