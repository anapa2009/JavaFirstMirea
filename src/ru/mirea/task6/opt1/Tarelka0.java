package ru.mirea.task6.opt1;
public class Tarelka0 extends Dish0 {
    private String razmer; //глубокая/ мелкая/ десертная

    public Tarelka0 (String element, String material,
                     String color, String razmer) {
        super (element, material, color);
        this.razmer = razmer;
    }

    public String getRazmer () {
        return razmer;
    }
    public void setRazmer (String razmer) {
        this.razmer = razmer;
    }

    @Override
    public String getName () {
        return dishElement;
    }


    @Override
    public String toString() {
        return "\nTarelka {Size: " + razmer +
                ", Material: " + material +
                ", Color: " + color + '}';
    }
}