package laba2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int x = in.nextInt();
        int x1 = x%5;
        int x2 = x%7;

        if (x1 == 2) {
            System.out.println("Число удовлетворяет критериям, остаток от деления на 5 : " +x1);
            }
        else {
            System.out.println("Число не удовлетворяет критериям: " );}
    }
}

