package stack;

import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(24);
        stack.push(35);
        stack.push(18);
        stack.push(78);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
