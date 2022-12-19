package day5.Assignment;

import java.util.Scanner;

public class Q1sort01 {
    public static int[] sortbinaryQ1(int[] arr) {
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    // array input function
    public static int[] arrayInput() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    // array print function
    public static void arrayPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // sort binary array in linear time
        // int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        int[] arr = arrayInput();

        int[] arr2 = new int[arr.length];
        arr2 = sortbinaryQ1(arr);
        arrayPrint(arr2);

    }

}
