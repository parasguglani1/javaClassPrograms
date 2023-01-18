package day11;

/* Rohan is a B.tech student and he wants to make some games for his younger siblings where we want them to find the longest substring without repeating characters. Write java program for the same

Definition of Substring: A substring is a subset or part of another string, or it is a contiguous sequence of characters within a string. */
public class worksheetq1 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

    private static String longestSubstring(String s) {
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = current.indexOf(c);
            if (index == -1) {
                current += c;
            } else {
                current = current.substring(index + 1) + c;
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }

}
