package ru.mirea.task13.opt2;
import java.util.*;

public class TestLinkedList {

    public static void main (String args[]) {

        LinkedList linkl = new LinkedList ();
        //Создаём LinkedList

        // Добавляем элементы в LinkedList
        linkl.add ("F");
        linkl.add ("B");
        linkl.add ("D");
        linkl.add ("E");
        linkl.add ("C");
        linkl.addLast ("Z");
        linkl.addFirst ("A");
        linkl.add (1, "A2");
        System.out.println ("Начальное содержимое linkl: " + linkl);

        // Удаляем элементы из LinkedList
        linkl.remove ("F");
        linkl.remove (2);
        System.out.println ("Содержимое linkl после удаления: " + linkl);

        // Удаляем первый и последний элементы
        linkl.removeFirst ();
        linkl.removeLast ();
        System.out.println ("linkl после удаления первого и последнего: " + linkl);

        // Получаем и устанавливаем значение
        Object val = linkl.get (2);
        linkl.set (2, (String) val + " Изменено");
        System.out.println ("linkl после изменения: " + linkl);


        int linkedSize = linkl.size();
        System.out.println ("размер linkl.size()= " + linkedSize);
        System.out.println ();

        System.out.println ("linkl.getFirst()= " + linkl.getFirst());
        //System.out.println ();
        System.out.println ("linkl.getLast()= " + linkl.getLast());
        //System.out.println ();
        System.out.println ("linkl.lastIndexOf(D)= " + linkl.lastIndexOf("D"));
        //System.out.println ();

        System.out.println ("linkl.contains (E)= " + linkl.contains ("E"));
        System.out.println ();

        for (int i = 0; i<linkl.size(); i++) {
            String value = (String) linkl.get(i);
            System.out.println (value);
        }
        System.out.println ();

        for (Object s : linkl)
            System.out.println (s);
        System.out.println ();

    }
}