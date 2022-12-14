

public class removeJava {
    public static void main(String[] args) {
        String s1 = "This is Java class";
        // String s2 = s1.replaceAll("Java", "");
        //using split
        String[] s2 = s1.split("Java");
        String s3 = "";
        for (int i = 0; i < s2.length; i++) {
            s3 = s3 + s2[i];
        }
        System.out.println(s3);
    }

}
