package ru.mirea.task6.opt2;
public class Shops extends Goods {
    private String model;

    public Shops (double price, String model) {
        super (price);
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    @Override
    public String toString () {
        return "\nSome good {" +
                "model= " + model + ", " + super.toString() +
                '}';
    }
}