package timus;

import java.io.PrintWriter;
import java.util.Scanner;
public class tusk1820 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        int x = 60*2;
        int y = 60;
        int result = (n*x) / (k*y);

        out.println(result);
        out.flush();
    }
}
