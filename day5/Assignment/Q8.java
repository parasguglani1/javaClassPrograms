package day5.Assignment;

public class Q8 {
    // 8. Java Program to Find the Missing Element in an Integer Array.
    public static int findMissing(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum2 = (n + 1) * (n ) / 2;
        return sum2 - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum2 = (n + 1) * (n ) / 2;
        System.out.println(sum2 - sum);
        System.out.println(findMissing(arr));

    }

}
