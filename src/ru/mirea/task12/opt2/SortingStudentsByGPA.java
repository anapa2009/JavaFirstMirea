package ru.mirea.task12.opt2;
import ru.mirea.task12.opt1.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare (Object obj1, Object obj2) {
        if (!(obj1 instanceof Student && obj2 instanceof Student))
            throw new IllegalArgumentException ("Объекты не являются студентами!");

        //return ((Student) obj1).getGPA() - ((Student) obj2).getGPA();
        return ((Student) obj2).getGPA() - ((Student) obj1).getGPA();
        //список будет отсортирован по возрастанию GPA
    }
}
