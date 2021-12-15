package ru.mirea.task14.opt1;
import java.util.Stack;

public class GameStack {
    Stack <Integer> fpl, spl; //fpl - 1-st player; spl - 2-nd player

    //---------------------------------------
    public GameStack (String fpl, String spl) {
        //заполняем стэки 1-го и 2-го игроков
        this.fpl = new Stack <> ();
        this.spl = new Stack <> ();
        for (int i = 4; i >= 0; i --) {
            this.fpl.push (Integer.parseInt (fpl.substring (i, i+1)));
            //fpl.push добавляет элемент на верх стека.
            //Integer.parseInt() возвращает число (номинал i-й карты)
            //public String substring (int beginIndex, int endIndex)
            this.spl.push (Integer.parseInt (spl.substring (i, i+1)));
        }
        System.out.println ("1st player stack : "  + fpl);
        System.out.println ("2nd player stack : "  + spl);
        System.out.println ("------------------------");
    }

    //-------------------------------------------------------
    private void pushBack (Stack <Integer> s, Integer item) {
        Stack <Integer> ns = new Stack <> ();
        //элементы из стэка s перегружаем в стэк ns =>
        //заталкиваем в стэк s элемент item (карту) => потом из стэка ns
        //обратно все заталкиваем в исходный стэк s. Заданная карта item
        //оказывается в самом низу стэка s.

        while (!s.isEmpty())
            ns.push (s.pop());
        //верхний элемент s.pop() удаляется из стека s
        //и помещается в стек ns
        //Метод pop() идеально подходит для реализации механики “игрок берет карту”
        s.push (item);
        while (!ns.isEmpty())
            s.push (ns.pop());
    }

    //---------------------
    public String play () {
        int count = 0;
        while ( (!fpl.isEmpty()) && (!spl.isEmpty()) && (count < 106)) {
            if ( (fpl.peek() > spl.peek()) && (spl.peek() != 0)) {
                //peek() возвращает верхний элемент стека, но не удаляет его из стека
                pushBack (fpl, fpl.pop());
                pushBack (fpl, spl.pop());
                //укладываем обе верхние карты в низ колоды 1-го игрока
            }
            else {
                pushBack (spl, fpl.pop());
                pushBack (spl, spl.pop());
                //укладываем обе верхние карты в низ колоды 2-го игрока
            }
            count++; //счетчик ходов
        }
        String res = "";
        if (count <= 106) {
            if (fpl.isEmpty())
                res += "second ";
            else
            if (spl.isEmpty())
                res += "first ";
            res += "; count= " + count;
        } else
            res += "count= " + count + "; botva"; //res += "; botva";
        return res;
    }

}