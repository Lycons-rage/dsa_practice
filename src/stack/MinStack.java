package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    Deque<Integer> first;

    public MinStack() {
        this.first = new ArrayDeque<>();
    }

    public void push(int val) {
        first.addLast(val);
    }

    public void pop() {
        first.removeLast();
    }

    public int top() {
        return first.getLast();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        int n = 0;
        while (n<first.size()){
            int current_val = first.removeLast();
            if (current_val < min){
                min = current_val;
            }
            first.addFirst(current_val);
            n++;
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return -1
        System.out.println(minStack.getMin()); // return -2
    }
}
