package ru.mirea.task5.opt3;
import java.lang.*;

public class Table extends ElemFurniture { //стол

    protected String tableType;  //кухонный/ письменный/ журнальный  и т.п.
    protected String tableColor;

    public Table (String ff, double cc, String mm,
                  String elem, double ww, double gl, double hh, String vid, String col)
    {
        super (ff, cc, mm, elem, ww, gl, hh);
        setTableType (vid);
        setTableColor (col);
        this.setElement ("table");
    }
    public Table () {
        super ();
        this.setElement ("table");
        setTableType ("kitchen");
        setTableColor ("white");
    }

    public String getTableType () {
        return tableType;
    }
    public void setTableType (String vid) {
        this.tableType = vid;
    }

    public String getTableColor () {
        return tableColor;
    }
    public void setTableColor (String col) {
        this.tableColor = col;
    }


    public double getAreaTable () {
        return this.width * this.glubina;
    }

    public String toString() {
        return super.toString() +
                "\nTable purpose: " + this.tableType + ". Color: " + this.tableColor;
    }
}