package day5.Assignment;

public class Q2 {
    // rorate array by k
    public static void rotateQ2(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }

    public static void main(String[] args) {
        // rotate array by k and k can be negative

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;

        rotateQ2(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}
