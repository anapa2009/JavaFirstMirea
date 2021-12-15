package ru.mirea.task5.opt2;
import java.lang.*;

public abstract class Dogs {
    private String namePoroda;
    private String purposePoroda;

    public Dogs (String str1, String str2) { //конструктор
        setNamePoroda (str1);
        setPurposePoroda (str2);
    }

    public void setNamePoroda (String str) {
        this.namePoroda = str;
    }
    public String setNamePoroda () {
        return namePoroda;
    }

    public void setPurposePoroda (String str) {
        this.purposePoroda = str;
    }
    public String getPurposePoroda () {
        return purposePoroda;
    }

    public String toString () {
        return this.namePoroda + ", aim: " + this.purposePoroda;
    }
}
