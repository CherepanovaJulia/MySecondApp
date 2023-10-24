package laba2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int x = in.nextInt();

        if (x >= 5 && x <= 10 ){
            System.out.println("Число попадает в диапазон от 5 до 10: " + x);
        }
        else {
            System.out.println("Число не попадает в диапазон от 5 до 10: " );}
    }
}

