package day5.Assignment;

public class Q3 {
    public static void main(String[] args) {
        // Find out smallest and largest number in a given Array?
        int[] arr = { 5,7,8,1,2,8,10,3,4,9 };
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

}
