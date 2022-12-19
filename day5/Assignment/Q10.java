package day5.Assignment;

public class Q10 {
    public static void main(String[] args) {

        // 10. Take an array as input from the user. Search for a given number x and
        // print the index at which it occurs.

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int x = 5;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(i);
            }
        }

    }

}
