package LinkedList.Singly;

public class removeDuplicates {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(4);

        list.display();

        removeDups(list.head, list.size);

        list.display();
    }

    static void removeDups(SinglyLL.Node head, int size) {
        SinglyLL.Node temp = head;

        while(temp.next!=null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
    }
}
