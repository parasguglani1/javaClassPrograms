

import java.util.Scanner;

public class stringtest {
    // main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fn = sc.nextLine();

        System.out.println("Enter your last name");
        String ln = sc.nextLine();

        // String fn = "paras";
        // String ln = "guglani";
        String name = fn + " " + ln;
        System.out.println(name);

        // traverse and print each character
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        sc.close();

        // String S1= "paras";
        // String S2= "paras";
        String S1 = new String("paras");
        String S2 = new String("paras");
        // ==
        if (S1 == S2) {
            System.out.println("S1 and S2 are equal using == operator");
        } else {
            System.out.println("S1 and S2 are not equal using == operator");
        }
        if (S1.equals(S2)) {
            System.out.println("S1 and S2 are equal using equals method");
        } else {
            System.out.println("S1 and S2 are not equal using equals method");
        }
        if (S1.compareTo(S2) == 0) {
            System.out.println("S1 and S2 are equal using compareTo method");
        } else {
            System.out.println("S1 and S2 are not equal using compareTo method");
        }


        // reverse words in string using split
        // remove white spaces
        // remove duplicate characters
        // replace the characters with its occurunces
        // longest substring without repeating characters
        // print all permutations of a string



    }

}
