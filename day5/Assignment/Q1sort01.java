package day5.Assignment;

public class Q1sort01 {
    public static int[] sortbinary(int[] arr) {
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

    public static void main(String[] args) {
        // sort binary array in linear time
        int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        int[] arr2 = new int[arr.length];
        arr2 = sortbinary(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        

    }

}
