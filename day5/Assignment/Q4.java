package day5.Assignment;

public class Q4 {
    public static void main(String[] args) {
        // . Java Program to Find Second Largest and Smallest Elements in an Array

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
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

}
