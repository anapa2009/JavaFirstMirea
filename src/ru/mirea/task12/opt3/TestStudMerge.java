package ru.mirea.task12.opt3;

import ru.mirea.task12.opt1.Student;

public class TestStudMerge {

    //------------------------------------------
    public static void main (String[] args) {

        Student[] students = new Student[] {
                new Student (15, 6),
                new Student (20, 8),
                new Student (289, 90),
                new Student (4, 280),
                new Student (264, 300)
        };

        System.out.println ("\nList 1:");
        for (Student s : students)
            System.out.println (s);

        //System.out.println ();
        Student[] students1 = new Student[] {
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };

        System.out.println ("\nList 2:");
        for (Student s : students1)
            System.out.println (s);

        //merge sort
        Student[] allStudents = new Student [students.length + students1.length];
        System.arraycopy (students, 0, allStudents, 0, students.length);
        System.arraycopy (students1, 0, allStudents, students.length, students1.length);

        mergeSort (allStudents, allStudents.length);

        System.out.println ("\nCommon sorted list:");
        for (Student s : allStudents) {
            System.out.println (s);
        }
    }


    //----------------------------------------------------
    public static void mergeSort (Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy (a, 0, l, 0, mid);
        System.arraycopy (a, mid, r, 0, n - mid);
        mergeSort (l, mid);
        mergeSort (r, n - mid);

        merge (a, l, r, mid, n - mid);
    }


    //---------------------------------------------------------------------
    public static void merge (
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo (r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}