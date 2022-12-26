package day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListVsLinkedList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1e5; i++) {
            list.add(i);

        }
        long startTime = System.nanoTime();

        // add element at the end of the list
        list.add(9403);
        // add element at the beginning of the list
        // list.add(0, 9403);
        long endTime = System.nanoTime();

        // LinkedList

        long arrayduration = (endTime - startTime);

        System.out.println("ArrayList took " + arrayduration + " nanoseconds");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 1e5; i++) {
            ll.add(i);
        }
        long startTime1 = System.nanoTime();
        // add element at the end of the list
        ll.add(9403);
        // add element at the beginning of the list
        // ll.add(0, 9403);
        long endTime1 = System.nanoTime();

        long linkedListduration = (endTime1 - startTime1);

        System.out.println("LinkedList took " + linkedListduration + " nanoseconds");

    }

}
