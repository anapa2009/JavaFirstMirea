package ru.mirea.task12.opt1;
public class TestStudVstavka {

    public static void main (String[] args) {

        Student[] students = new Student[] {
                new Student (15, 6),
                new Student (20, 8),
                new Student (289, 90),
                new Student (4, 280),
                new Student (264, 300)
        };
        System.out.println (); //"\n"
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println ();

        //Вставки по id
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;

            for (; j >= 0 && (current.compareTo (students[j]) < 0); j--) {
                students[j+1] = students[j];

            }
            students[j+1] = current;

        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}