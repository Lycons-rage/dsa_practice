package queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> first;
    Stack<Integer> second;

    public QueueUsingStack() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void push(int x) {
        while(!second.empty()){
            int temp = second.pop();
            first.push(temp);
        }
        first.push(x);
    }

    public int pop() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.pop();
    }

    public int peek() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.peek();
    }

    public boolean empty() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.empty();
    }

    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println("Element Deleted : "+obj.pop());
        obj.push(5);
        System.out.println("Element Deleted : "+obj.pop());
        System.out.println("Element Deleted : "+obj.pop());
        System.out.println("Element Deleted : "+obj.pop());
        System.out.println("Element Deleted : "+obj.pop());

    }
}
