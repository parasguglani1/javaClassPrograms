

public class Allpermutations {

    public static void printPermutationsofalllength(String s1, String s2) {
        if (s1.length() == 0) {
            System.out.println(s2);
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            String ros = s1.substring(0, i) + s1.substring(i + 1);
            printPermutationsofalllength(ros, s2 + ch);
        }

    }
    public static void main(String[] args) {

        String s1 = "paras";
        //print all permutations of a string s1 of length 1 to length s1.length() in all possible ways using recursion
        printPermutationsofalllength(s1, "");

    }
}
