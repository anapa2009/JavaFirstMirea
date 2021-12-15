package ru.mirea.task12.opt1;
public class Student implements Comparable {

    private int idNum;
    private int GPA;

    public Student (int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public int getIdNum () {
        return idNum;
    }

    public void setIdNum (int idNum) {
        this.idNum = idNum;
    }

    public int getGPA () {
        return GPA;
    }

    public void setGPA (int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo (Object obj) {
        if (!(obj instanceof Student))
            throw new IllegalArgumentException ("Объект не является студентом!");
        // < 0 -> obj, 0 -> ==, >0 -> this;
        return this.idNum - ((Student) obj).idNum;
    }

    @Override
    public String toString () {
        return "Student {idNum= " + idNum + ", GPA= " + GPA + "}";
    }
}
