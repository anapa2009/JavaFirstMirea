package ru.mirea.task5.opt1;

public class TestDish {
    //создаем класс TesterDish с уровнем доступа public

    public static void main (String[] args) {

        Tarelka t = new Tarelka ("Тарелка","Керамическая","Белый","Большая");
        //создаем экземпляр «t» класса Tarelka с параметрами:
        //керамическая (переменная «material»),
        //белый (переменная «color»,
        //большая (переменная «razmer»

        System.out.println(t); //выводим объект t на экран
        System.out.println("\n"+t.color);
        System.out.println("\n"+t.dishElement);
    }
}
