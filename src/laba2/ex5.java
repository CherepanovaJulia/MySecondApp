package laba2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int x = in.nextInt();
        String str = Integer.toString(x);
        char ch = str.charAt(0);

        if (x >= 1000 && x <= 9000){
            System.out.println("Во введенном числе: " + ch + "тысяч");
        }
        else if (x<1000) {
            System.out.println("Введите числов диапазоне от 1000 до 9 000: ");
        }
        else {
        }
    }
}

