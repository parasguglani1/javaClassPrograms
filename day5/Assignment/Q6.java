package day5.Assignment;

public class Q6 {
    // insert
    public static int[] insert(int[] arr, int index, int value) {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            } else if (i == index) {
                arr2[i] = value;
            } else {
                arr2[i] = arr[i - 1];
            }
        }
        return arr2;
    }

    // delete
    public static int[] delete(int[] arr, int index) {
        int[] arr3 = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                arr3[i] = arr[i];
            } else if (i == index) {
                continue;
            } else {
                arr3[i - 1] = arr[i];
            }
        }
        return arr3;
    }

    // display
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 6. Java Programs on Inserting & Deleting Elements from an Array.
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[arr.length + 1];
        int[] arr3 = new int[arr.length - 1];
        int index = 5;
        int value = 11;


        // insert
        arr2 = insert(arr, index, value);
        display(arr2);

        System.out.println();


    }

}
