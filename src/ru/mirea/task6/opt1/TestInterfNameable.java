package ru.mirea.task6.opt1;
public class TestInterfNameable {
    public static void main (String[] args) {

        //DogNew pp = new DogNew ("Sharik", age, "middle");
        DogNew pp = new DogNew ("Sharik", 3, "middle");
        System.out.println(pp);
        System.out.println("Name= "+pp.getName());

        Tarelka0 tt = new Tarelka0 ("Tarelka", "Keramika", "red", "little");
        System.out.println(tt);
        System.out.println("Name= "+tt.getName());
    }
}
