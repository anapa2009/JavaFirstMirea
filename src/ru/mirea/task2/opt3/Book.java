package ru.mirea.task2.opt3;
//--------------------

public class Book {

    private String author;
    private String title;
    private int year;  //year of book publication;
    private int pages; //amount of pages;

    //--------------------------
    // Constructors (overloaded)
    public Book (String str1, String str2, int yy, int pp) { // 1st
        this.author=str1;
        this.title=str2;
        this.year=yy;
        this.pages=pp;
    }
    public Book () { // 2nd
        this.author=" ";
        this.title=" ";
        this.year=0;
        this.pages=0;
    }

    //---------------------------------
    public void setAuthor (String str1) { // methods
        this.author=str1;
    }
    public void setTitle (String str2) {
        this.title=str2;
    }
    public void setYearBook (int yy) {
        this.year=yy;
    }
    public void setPagesBook (int pp) {
        this.pages=pp;
    }


    public String getAuthor () {
        return author;
    }
    public String getTitle () {
        return title;
    }
    public int getYearBook () {
        return year;
    }
    public int getPagesBook () {
        return pages;
    }

    //----------------------
    public String toString () {
        return "Book: "+this.author+"; "+this.title+"; "
                +"publication year: "+this.year+" ; pages: "+this.pages;
    }
}

