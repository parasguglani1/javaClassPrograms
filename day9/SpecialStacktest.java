package day9;

import java.util.LinkedList;
import java.util.Stack;

class SpecialStack {

    /*
     * Design a Data Structure SpecialStack that supports all the stack operationsx
     * like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
     * which should return minimum element from the SpecialStack. (Expected
     * complexity – O(n))
     */

/*     LinkedList<Integer> stack = new LinkedList<Integer>();

    public void push(int x) {
        stack.addFirst(x);
    }

    public int pop() {
        return stack.removeFirst();
    }

    public int getMin() {
        int min = stack.getFirst();
        for (int i = 1; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }
        return min;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return false;
    } */
    //without using collection
/*
// using array
    int[] stack = new int[10];
    int top = -1;

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int getMin() {
        int min = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }
        return min;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

 */

 //using linkedlist
    LinkedList<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> minStack = new LinkedList<Integer>();

    public void push(int x) {
        stack.addFirst(x);
        if (minStack.isEmpty() || x <= minStack.getFirst()) {
            minStack.addFirst(x);
        }
    }

    public int pop() {
        int x = stack.removeFirst();
        if (x == minStack.getFirst()) {
            minStack.removeFirst();
        }
        return x;
    }

    public int getMin() {
        return minStack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

}

public class SpecialStacktest {

    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

    }

}
