package day11;

/*
2.John is a Computer Science teacher, how also happens to teach Mathematics part time to earn some extra bucks . He is teaching his students about Sets and subsets, Some student asks him about a question , help him to solve that question by providing a appropriate Java code.
Ques : There is an array of integers having unique elements, Provide all the possible subsets(The power sets).
The solution set must not contain duplicate subsets, but we free to return the solution in any order. */
public class worksheetq2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));
    }

    private static String subsets(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] + " ";
            for (int j = i + 1; j < nums.length; j++) {
                result += nums[j] + " ";
            }
            result += " ";
        }
        return result;
//can you reverse servlet in client and server side automatically
    }
}
