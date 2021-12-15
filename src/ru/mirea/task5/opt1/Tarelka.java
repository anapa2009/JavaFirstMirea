package ru.mirea.task5.opt1;

public class Tarelka extends Dish {
    private String razmer; //глубокая/ мелкая/ десертная

    public Tarelka (String element, String material,
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
    public String toString() {
        return "\nTarelka {Size: " + razmer +
                ", Material: " + material +
                ", Color: " + color + '}';
    }
}