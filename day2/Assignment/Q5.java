package day2.Assignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Sample Input
         * java 100
         * cpp 65
         * python 50
         * Sample Output
         * ================================
         * java 100
         * cpp 065
         * python 050
         */
        String str[] = new String[3];
        int x[] = new int[3];

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
            x[i] = sc.nextInt();
            System.out.printf("%-15s%03d %n", str[i], x[i]);
        }
        sc.close();

    }
}
