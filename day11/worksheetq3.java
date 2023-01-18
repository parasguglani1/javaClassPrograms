package day11;

public class worksheetq3 {
    /*
     * 3.In semester exam students get there marks and teacher put those marks in a
     * integer array of size K, now a student Smith wants to know his rank , So now
     * teacher have to return the kth largest element in the array. We have to keep
     * some things in mind that Kth largest element in the sorted order, not the kth
     * distinct element.
     */

    public static void main(String[] args) {
        int[] nums = { 5, 8, 1,10, 3, 2, 4, 7, 6, 9 };
        int k = 3;
        System.out.println(kthLargest(nums, k));
    }

    private static int kthLargest(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[nums.length - k];
    }
}
