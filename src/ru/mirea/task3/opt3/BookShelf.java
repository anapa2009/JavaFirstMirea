package ru.mirea.task3.opt3;

public class BookShelf {

    // Private variables
    private static int booksAmount;  //variable - amount of books
    private static Book[] arr;       //array of books (objects)

    // Constructors (overloaded)
    //--------------------------
    public BookShelf (int n, Book[] arr0) { // 1st Constructor
        this.booksAmount = n;
        this.arr = arr0;
    }
    public BookShelf () { // 2nd Constructor
        this.booksAmount = 0;
    }

    //---------------------------------------
    public static void setAmountBooks (int n) { // methods
        booksAmount = n; //set booksAmount
    }
    public static void setArrBooks (Book[] arr0) { // method
        arr = arr0; //set array of books
    }
    public static int getAmountBooks () { // method
        String numStr = String.format ("%2d", booksAmount);
        System.out.println (" ");
        System.out.println ("Books amount: " + numStr);
        return booksAmount; // get booksAmount
    }
    //----------------------------------
    public static void getListOfBooks () {
        System.out.println (" ");
        System.out.println ("Books at bookself: ");
        for (int i = 0; i < booksAmount; i++) {
            String authorStr = arr[i].getAuthor ();
            String titleStr = arr[i].getTitle ();
            String yearStr = String.format ("%4d", arr[i].getYearBook ());
            String pagesStr = String.format ("%4d", arr[i].getPagesBook ());
            String numStr = String.format ("%2d", (i+1));

            System.out.println ("Book " + numStr + ": " + authorStr + "; " + titleStr + "; "
                    + "publication year: " + yearStr + " ; pages: " + pagesStr);
        }
    }
    //--------------------------------------
    public static void lookGivenBook (int i) {
        if (i>=booksAmount)
            return;

        //System.out.println (" ");
        //System.out.println ("Books at bookshelf: ");
        String numStr = String.format ("%2d", (i+1));

        String authorStr = arr[i].getAuthor ();
        String titleStr = arr[i].getTitle ();
        String yearStr = String.format ("%4d", arr[i].getYearBook ());
        String pagesStr = String.format ("%4d", arr[i].getPagesBook ());

        System.out.println ("Book " + numStr + ": " + authorStr + "; " + titleStr + "; "
                + "publication year: " + yearStr + " ; pages: " + pagesStr);
    }
    //------------------------------------
    public static void getYearsDiapazon () {
        int numMin=100000;
        int numMax=0;
        int orderYearMin=0;
        int orderYearMax=0;
        int ii=0;
        for (int i = 0; i < booksAmount; i++) {
            ii=arr[i].getYearBook ();
            if (ii<numMin) {
                numMin=ii;
                orderYearMin=i;
            }
            if (ii>numMax) {
                numMax=ii;
                orderYearMax=i;
            }
        }
        String str1 = String.format ("%4d", numMin);
        String str2 = String.format ("%4d", numMax);

        System.out.println (" ");
        System.out.println ("Earliest and last years of books publication: " + str1 + " - " + str2);
        lookGivenBook(orderYearMin); //printing information about book;
        lookGivenBook(orderYearMax);
    }
    //------------------------------------
    public static void sortByYearsBooks () {
        int[] order=new int[booksAmount];
        int[] years=new int[booksAmount];

        for (int i = 0; i < booksAmount; i++) {
            order[i]=i;
            years[i]=arr[i].getYearBook ();
        }

        int ii=0;
        for (int i = 0; i < booksAmount; i++) {
            for (int j = i; j < booksAmount; j++) {
                if (years[order[i]]>years[order[j]]) {
                    ii=order[i];
                    order[i]=order[j];
                    order[j]=ii;
                }
            }
        }

        System.out.println (" ");
        System.out.println ("Sorted by publication years list of books: ");
        for (int i = 0; i < booksAmount; i++) {
            lookGivenBook(order[i]); //printing information about book;
        }
    }

    //----------------------
    @Override
    public String toString() {
        return "Books amount: "+this.booksAmount;
    }

}

