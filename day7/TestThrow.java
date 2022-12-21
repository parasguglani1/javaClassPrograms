package day7;

import java.io.FileNotFoundException;

public class TestThrow {
    // checknum
    public static void checknum(int num) throws Exception  {
        if (num < 0) {
            throw new FileNotFoundException("This is an exception");

        } else {
            System.out.println("This is not an exception");
        }

    }

    // main
    public static void main(String[] args) {
        // throw
        /*
         * try {
         * throw new Exception("This is an exception");
         * } catch (Exception e) {
         * System.out.println(e.getMessage());
         * }
         */

        TestThrow t = new TestThrow();
        try {
            t.checknum(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("This is not an exception");
    }
}
//we can use throws keyword to delicate responsibility of exception handling to the caller of the method it maybe another method or main method(jvm)
//we can use throw keyword to throw an exception explicitly
//we can use try catch block to handle exception

