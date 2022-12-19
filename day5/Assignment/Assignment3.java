package day5.Assignment;

import java.util.Scanner;

public class Assignment3 {
    public static int[] Q1sortbinary(int[] arr) {
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

    public static void Q2rotate(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }

    public static void Q3smallestLargest(int[] arr, int k) {
        int n = arr.length;
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
        System.out.println("Largest number in the array is: " + largest);
    }

    // to Find Second Largest and Smallest Elements in an Array
    public static void Q4secondLargestSmallest(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // second largest
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number in the array is: " + secondLargest);
        // second smallest
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest number in the array is: " + secondSmallest);
    }

    // 5. Java Program to Find the Minimum Distance between Array Elements.

    public static void Q5minDistance(int[] arr) {
        int minDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) < (minDiff)) {
                minDiff = (arr[i + 1] - arr[i]);
            }
        }
        System.out.println("Minimum difference between consecutive elements is: " + minDiff);
    }

    // 6. Java Programs on Inserting & Deleting Elements from an Array.

    public static void Q6insert(int[] arr, int index, int element) {
        int n = arr.length;
        // if index is greater than array length
        if (index > n) {
            System.out.println("Index out of bounds");
        }
        // if index is less than array length
        else {
            // inserting element using shift
            for (int i = n - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;

        }

    }

    // delete element from array
    public static int[] Q6delete(int[] arr, int index) {
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

    public static void Q7cyclicallyPermute(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }

    public static int Q8findMissing(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum2 = (n + 1) * (n) / 2;
        return sum2 - sum;
    }
    // Program to return all the Leaders in an Array

    public static int[] Q9leaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");

        int Leaders[] = new int[n];
        int j = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                // add max to array Leaders
                Leaders[i] = max;
                j++;
            }
        }
        return Leaders;

    }

    //Q10 linear search
    public static int Q10linearSearch(int[] arr, int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // display
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // array input function

    public static int[] arrayInput() throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
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
        // handle array input exception

        int[] arr;
        try {
            arr = arrayInput();
            int[] arr2 = new int[arr.length];
            arr2 = Q1sortbinary(arr);
            arrayPrint(arr2);

            int k = 3;
            Q2rotate(arr, k);
            arrayPrint(arr);

            Q3smallestLargest(arr, k);

            Q4secondLargestSmallest(arr);

            Q5minDistance(arr);

            int index = 3;
            int element = 10;
            Q6insert(arr, index, element);
            arrayPrint(arr);

            Q6delete(arr, index);
            arrayPrint(arr);

            Q7cyclicallyPermute(arr, k);
            arrayPrint(arr);

            int missing =Q8findMissing(arr);
            System.out.println(missing);

            int[] Leaders = Q9leaders(arr);
            arrayPrint(Leaders);

            int element2 = 10;
            int index2 = Q10linearSearch(arr, element2);
            System.out.println(index2);
            


        } catch (Exception e) {
            System.out.println("array input exception");
        }

    }

}
