package ru.mirea.task5.opt2;
import java.lang.*;

public class Poroda extends Dogs {
    private String razmer; //большая/ средняя/ маленькая
    private double rost; //средний рост собак породы
    private double weight; //средний вес собак породы
    private String typeShersti;
    //длинношерстная/ средняя длина шерсти/ короткошерстная

    //private String namePoroda;
    //private String purposePoroda;

    public Poroda (String str1, String str2, String str3,
                   double rost, double weight, String str4) { //конструктор
        super (str1, str2);
        setRazmer (str3);
        setRost (rost);
        setWeight (weight);
        setTypeShersti (str4);
    }

    public void setRazmer (String str) {
        this.razmer = str;
    }
    public String getRazmer () {
        return razmer;
    }


    public void setRost (double rost) {
        this.rost = rost;
    }
    public double getRost () {
        return rost;
    }


    public void setWeight (double weight) {
        this.weight = weight;
    }
    public double getWeight () {
        return weight;
    }


    public void setTypeShersti (String str) {
        this.typeShersti = str;
    }
    public String getTypeShersti () {
        return typeShersti;
    }

    public String toString () {
        return super.toString() + ". Razmer: " + this.razmer + ", rost: "
                + String.format ("%6.1f", this.rost) + ", weight: "
                + String.format ("%6.1f", this.weight) +  ". Type shersti: "
                + this.typeShersti;
    }
}
