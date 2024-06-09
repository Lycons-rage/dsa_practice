package LinkedList.Singly.Hard;

import LinkedList.Singly.SinglyLL;

public class ReverseNodesInKGroups {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.display();

        list.head = revKGroup(list.head, 3);
        list.display();
    }

    private static SinglyLL.Node revKGroup(SinglyLL.Node head, int k) {
        if (k<=1 || head == null){
            return head;
        }

        SinglyLL.Node current = head;
        SinglyLL.Node previous = null;

        while(true) {
            SinglyLL.Node last = previous;
            SinglyLL.Node newEnd = current;
            SinglyLL.Node next = current.next;
            for (int i = 0; i < k && current != null; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = previous;
            } else {
                head = previous;
            }
            newEnd.next = current;

            if(current == null){
                break;
            }
            previous = newEnd;
        }

        return head;
    }
}
