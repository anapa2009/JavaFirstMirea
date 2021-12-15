package ru.mirea.task10.opt4;
import java.util.Scanner;
public class Main {

    public static int pereb(int accum, int sum, int k, int s) { // Задаем накопление кол-ва цифр и временную сумму
        if (accum == k) // Количество цифр достигло предела K
            if (sum == s)
                return 1;
                else return 0;

        int cnt = 0;
        for (int i = (accum == 0) ? 1 : 0; i <= 9; i++) { // Цифры от 1(0) до 9
            cnt += pereb(accum + 1, sum + i, k, s);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральные числа K и S:");

        int k = sc.nextInt();
        int s = sc.nextInt();

        if (k < 1 || s < 1) {
            System.out.println ("Введите числа заново - только натуральные числа");
            return; //0
        }

        System.out.println("Кол-во способов получения суммы S из цифр K-значного числа: ");
        System.out.print(pereb(0, 0, k, s));
    }
}