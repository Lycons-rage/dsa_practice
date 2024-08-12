package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    public static void main(String[] args) {
        // stack is a class but queue is an interface
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(10);
        queue.add(7);
        queue.add(8);
        queue.add(34);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // when to use queue?? when we want to store the intermediate result and trees and graph
        // conversion of recursion to iteration
    }
}
