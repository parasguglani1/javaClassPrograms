package day5.Assignment;

public class Q5 {
    public static void main(String[] args) {

        // 5. Java Program to Find the Minimum Distance between Array Elements.

        int[] arr = { 5, 7, 8, 1, 2, 8, 10, 3, 4, 9 };

        // find consecutive minimum difference

        int minDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) < (minDiff)) {
                minDiff = (arr[i + 1] - arr[i]);
            }
        }
        System.out.println("Minimum difference between consecutive elements is: " + minDiff);

    }

}
