

public class removeDuplicateChar {
    public static void main(String[] args) {
        String s1 = "aaabbbbccdeffghhij";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) == -1) {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
