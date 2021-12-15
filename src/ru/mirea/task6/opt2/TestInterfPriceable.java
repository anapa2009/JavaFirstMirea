package ru.mirea.task6.opt2;
public class TestInterfPriceable {
    public static void main (String[] args) {

        ElemFurniture0 furn = new ElemFurniture0
                ("firma 1", 10000.0, "wool", "shkaff",150.,60.,180.);

        System.out.println(furn);
        System.out.println("Price= "+furn.getPrice());

        Shops p = new Shops(100.0, "Какая-то модель");
        System.out.println(p);
        System.out.println("Price= "+p.getPrice());
    }
}
