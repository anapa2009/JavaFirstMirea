package ru.mirea.task6.opt1;
import java.lang.*;

public abstract class Dog0 implements Nameable {
    private String name;
    private int age;

    public Dog0 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public void setName (String name) {
        this.name = name;
    }
    //@Override
    public String getName () { //(String name) {
        return name;
    }

    public String getNameNew () { //(String name) {
        return name;
    }



    public String toString () {
        return this.name + ", age " + this.age;
    }

}
