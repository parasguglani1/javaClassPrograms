package day9;

import java.util.HashMap;

public class hashmaptest {

    public static void main(String[] args) {

        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        mp. put(1, "one");
        mp. put(2, "two");
        mp. put(3, "three");
        mp. put(4, "four");
        mp. put(5, "five");


        System.out.println(mp.get(1));
        System.out.println(mp.get(2));

        for (int i = 1; i <= mp.size(); i++) {
            System.out.println(mp.get(i));
        }



    }

}
