package laba2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int x = in.nextInt();
        int x1 = x % 4;

        if (x >= 10 && x1 == 0) {
            System.out.println("Число удовлетворяет критериям: " + x1);
        } else {
            System.out.println("Число не удовлетворяет критериям: ");
        }
    }
}

