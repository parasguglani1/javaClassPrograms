package day1;
public class stringBuffer {
    // reverse string remove index from 4 to 9 using string buffer
    public static void main(String[] args) {
        String s = "hello world paras";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        sb.delete(4, 9);
        System.out.println(sb);
    }

}
