package ru.mirea.task5.opt2;
public class TestDogs {
    //создаем класс TestDogs с уровнем доступа public

    public static void main (String[] args) {

        Poroda s1 = new Poroda ("терьер","охотничья","средняя", 50.0, 10.0, "средняя");

        System.out.println("\n"+s1); //выводим объект s1 на экран
    }
}
