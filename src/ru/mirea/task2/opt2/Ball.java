package ru.mirea.task2.opt2;
import java.lang.*;

public class Ball {

    private double size; //max ball size
    private double weight; //ball weight
    private String form; //sphere or ellipse
    private String ballPurpose; //вид спорта (мяч для вида спорта) или игрушка
    private String color;
    private double price; //ball price

    public Ball (double rr, double ww, String str1,
                 String str2, String str3, double pp) {
        size=rr;
        weight=ww;
        form=str1;
        ballPurpose=str2;
        color=str3;
        price=pp;
    }
    public Ball (String str2) {
        size=1;
        weight=1;
        form="sphere";
        ballPurpose=str2;
        color="braun";
        price=0.0;

    }
    public Ball () {
        size=1;
        weight=1;
        form="sphere";
        ballPurpose="toy";
        color="red";
        price=0.0;
    }

    public void setMaxBallSize (double rr) {
        this.size = rr;
    }
    public void setBallWeight (double ww) {
        this.weight = ww;
    }
    public void setBallForm (String str1) {
        this.form = str1;
    }
    public void setBallPurpose (String str2) {
        this.ballPurpose = str2;
    }
    public void setBallColor (String str3) {
        this.color = str3;
    }
    public void setPrice (double pp) {
        this.price = pp;
    }


    public double getMaxBallSize () {
        return this.size;
    }
    public double getBallWeight () {
        return this.weight;
    }
    public String getBallForm () {
        return this.form;
    }
    public String getBallPurpose () {
        return this.ballPurpose;
    }
    public String getBallColor () {
        return this.color;
    }
    public double getPrice () {
        return this.price;
    }


    public String toString () {
        String str = "max size = "+this.size+" sm; weight "+this.weight
                +" gr; form: "+this.form+";"+System.lineSeparator()
                +"ball purpose: "+this.ballPurpose
                +"; color: "+this.color+"; price: "+this.price+" rub.";
        return str;
    }

}
