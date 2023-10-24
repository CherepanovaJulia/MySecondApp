package laba2;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = in.nextInt();
        int x = number;
        int x1 = x%3;
        if (x1 == 0){
            System.out.println("Число делится на 3 без остатка: " +x1);
        }
        else {
            System.out.println("Число не делится на 3, остаток: " +x1);
        }
    }
}
