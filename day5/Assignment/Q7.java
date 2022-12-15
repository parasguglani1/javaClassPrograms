package day5.Assignment;

public class Q7 {

    // 7. Java Program to Cyclically Permute all the Elements of an Array using recursion
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }
        return arr2;
    }

    public static void cyclicallyPermute(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[arr.length];
        int n = arr.length;
        int k = 3;

        // cyclicallyPermute
        cyclicallyPermute(arr, k);

        // display
        display(arr);





    }
}
