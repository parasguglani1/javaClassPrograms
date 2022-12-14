

import java.util.HashMap;
import java.util.Map;

public class replacecharwithoccurunces {
    public static void main(String[] args) {
        String s1 = "This is Java class";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            s1 = s1.replace(entry.getKey(), (char) (entry.getValue() + 48));
        }
        System.out.println(s1);

    }
}
