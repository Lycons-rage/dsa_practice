package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addLast(6);
        deque.addFirst(7);
        deque.addFirst(1);
        deque.addLast(0);
        deque.addFirst(9);

        // deque offers insertion and deletion from both the sides
    }
}
