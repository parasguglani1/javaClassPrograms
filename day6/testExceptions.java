package day6;

public class testExceptions {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            //add numbers
            int x = myNumbers[0] + myNumbers[1] + myNumbers[2];
            System.out.println(x);

        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
        // catch (Exception e) {
        //     System.out.println("Something went wrong.");
        // }
        // System.out.println("hello");
        //  catch (Exception e) {
        //     System.out.println("Something went wrong2.");
        // }


    }
}
