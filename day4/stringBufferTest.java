import java.util.Scanner;

public class stringBufferTest {
    // main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fn = sc.nextLine();
        fn.concat("guglani");

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

        // String fn = "paras";
        // String ln = "guglani";
        StringBuffer name = new StringBuffer(fn);
        name.append(" guglani");
        // System.out.println(name);

        final StringBuffer S11 = new StringBuffer("paras");
        StringBuffer S22 = new StringBuffer("paras");
        // ==
        if (S11 == S22) {
            System.out.println("S1 and S2 are equal using == operator");
        } else {
            System.out.println("S1 and S2 are not equal using == operator");
        }
        if (S11.equals(S22)) {
            System.out.println("S1 and S2 are equal using equals method");
        } else {
            System.out.println("S1 and S2 are not equal using equals method");
        }
        S11.append(" guglani");
        System.out.println(S11);

    }

}
//string buffer is thread safe
//string builder is not thread safe
//string buffer is slower than string builder
//string buffer is immutable
