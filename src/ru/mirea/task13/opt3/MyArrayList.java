package ru.mirea.task13.opt3;
public class MyArrayList <T> {

    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object [] array = new Object [INIT_SIZE];
    private int pointer = 0;

    //------------------------
    public void add (T item) {
        //добавление нового элемента в список. При достижении
        //границы массива происходит увеличение размера массива
        if (pointer == array.length-1)
            resize (array.length*2); //увеличиваем размер массива в 2 раза,
        //если достигнута граница массива
        array [pointer++] = item;
    }

    //------------------------
    public T get (int index) {
        //возврат элемента списка по его индексу
        return (T) array [index];
    }

    //------------------------------
    public void remove (int index) {
        //удаление элемента списка по индексу; все элементы справа
        //от удаляемого перемещаются на шаг влево
        //Если после удаления элемента количество элементов стало в
        //CUT_RATE раз меньше чем размер массива, то длину массива
        //уменьшаем в два раза, для экономии памяти

        for (int i = index; i<pointer; i++)
            array [i] = array [i+1];
        array [pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize (array.length/2);
        //если элементов в массиве CUT_RATE раз меньше чем
        //длина массива, то уменьшаем длину массива в два раза
    }

    //------------------
    public int size () {
        //возврат количества элементов в списке
        return pointer;
    }

    //-----------------------------------
    private void resize (int newLength) {
        //вспомогательный метод для масштабирования
        Object [] newArray = new Object [newLength];
        System.arraycopy (array, 0, newArray, 0, pointer);
        array = newArray;
        System.out.println ("\nresizing list array: new length= " + newLength);
    }
}
