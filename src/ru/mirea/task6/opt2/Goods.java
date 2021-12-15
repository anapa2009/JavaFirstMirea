package ru.mirea.task6.opt2;
public abstract class Goods implements Priceable {
    private double price;

    public Goods (double price) {
        this.price = price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    @Override
    public double getPrice () {
        return price;
    }

    @Override
    public String toString () {
        return "price=" + price;
    }
}