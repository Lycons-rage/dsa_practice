package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingQueue {

    Deque<Integer> first;

    public StackUsingQueue() {
        this.first = new ArrayDeque<>();
    }

    public void push(int x) {
        first.addLast(x);
    }

    public int pop() {
        return first.removeLast();
    }

    public int top() {
        return first.getLast();
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}
