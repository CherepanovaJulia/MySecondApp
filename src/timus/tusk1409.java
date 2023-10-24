package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class tusk1409 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int result = (x + y - 1);
        int result2 = (result - x);
        int result3 = (result - y);

        out.println(+result2 + " " + result3);
        out.flush();
    }
}