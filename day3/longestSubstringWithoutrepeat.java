

public class longestSubstringWithoutrepeat {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) == -1) {
                s2 = s2 + s1.charAt(i);
            } else {
                if (s2.length() > s3.length()) {
                    s3 = s2;
                }
                s2 = "";
            }
        }
        System.out.println(s3);
    }
}
