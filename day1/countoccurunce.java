package day1;
import java.util.Scanner;

public class countoccurunce {
    public static void main(String[] args) {
        // String s = "checklll";
        // char c = 'l';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the character");
        String c= sc.next();
        int countt = 0;
        countt = s.length() - s.replace("l", "").length();
        System.out.println(countt);

    }

}

