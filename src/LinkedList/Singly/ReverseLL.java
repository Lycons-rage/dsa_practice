package LinkedList.Singly;

public class ReverseLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();

        reversePartofLL(list.head, 2, 4);

        SinglyLL.Node temp = list.head;
        list.head = reverseLL(list.head);

        list.display();


    }

    private static SinglyLL.Node reversePartofLL(SinglyLL.Node head, int left, int right) {
        if(left == right){
            return head;
        }

        SinglyLL.Node current = head;
        SinglyLL.Node previous = null;

        //skip the first left-1 nodes
        for (int i = 0; i < left-1 && current!=null; i++) {
            previous = current;
            current = current.next;
        }

        SinglyLL.Node last = previous;
        SinglyLL.Node newEnd = current;
        SinglyLL.Node next = current.next;
        for (int i = 0; i < right-left+1 && current!=null; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if(next!=null) {
                next = next.next;
            }
        }

        if(last!=null){
            last.next = previous;
        }else{
            head = previous;
        }
        newEnd.next = current;
        return head;
    }

    //recursive approach
    private static SinglyLL.Node reverseLL(SinglyLL.Node head, SinglyLL.Node current) {
        if(current.next==null){
            head = current;
            return head;
        }

        SinglyLL.Node temp = reverseLL(head, current.next);

        temp.next = current;
        current = temp;
        current.next = null;

        return head;

        //debug this
    }

    //iterative approach
    private static SinglyLL.Node reverseLL(SinglyLL.Node head){
        if(head == null){
            return head;
        }
        SinglyLL.Node prev = null;
        SinglyLL.Node pres = head;
        SinglyLL.Node next = pres.next;

        while(pres!=null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null) {
                next = next.next;
            }
        }
        return prev;
    }
}
