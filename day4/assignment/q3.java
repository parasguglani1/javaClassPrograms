package assignment;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        /*
         * WAP to read words from the keyboard until the word done is entered. For each
         * word except done, report whether its first character is equal to its
         * last character. For the required loop, use a
         * a)while statement
         * b)do-while statemen
         */

        Scanner sc = new Scanner(System.in);
        // using while loop
        String word = sc.nextLine();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equal");
            } else {
                System.out.println("First and last character are not equal");
            }
            word = sc.nextLine();
        }

        // using do while loop

        String word1;
        do {
            word1 = sc.nextLine();
            if (word1.charAt(0) == word1.charAt(word1.length() - 1)) {
                System.out.println("First and last character are equal");
            } else {
                System.out.println("First and last character are not equal");
            }
            word1 = sc.nextLine();
        } while (!word1.equals("done"));
sc.close();
    }
}
