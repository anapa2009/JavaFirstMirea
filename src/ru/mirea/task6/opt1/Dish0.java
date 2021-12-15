package ru.mirea.task6.opt1;
public abstract class Dish0 implements Nameable{
    protected String dishElement; //разновидность посуды
    protected String material;
    protected String color;

    public Dish0 (String element, String material, String color) {
        this.dishElement = element;
        this.material = material;
        this.color = color;
    }


    public String getDishElement () {
        return dishElement;
    }
    public void setDishElement (String element) {
        this.dishElement = element;
    }


    public String getMaterial () {
        return material;
    }
    public void setMaterial (String material) {
        this.material = material;
    }

    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        color = color;
    }

    @Override
    public String getName () {
        return dishElement;
    }

    @Override
    public String toString () {
        return "\nDish " + dishElement + "{"
                + "Material " + material + '\'' +
                ", Color" + color + '\'' + '}';
    }
}
