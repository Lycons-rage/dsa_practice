package LinkedList.Singly;

public class ReOrderLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();

        list.head = reOrder(list.head);

        list.display();
    }

    private static SinglyLL.Node reOrder(SinglyLL.Node head) {
        if(head==null || head.next == null){
            return head;
        }
        //find mid
        SinglyLL.Node mid = findMid(head);

        //reverse second half
        SinglyLL.Node head2 = reverseLL(mid);
        SinglyLL.Node head1 = head;

        while(head1 != null && head2 != null) {
            SinglyLL.Node temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head;
            head2 = temp;
        }

        if(head1 != null){
            head1.next = null;
        }

        return head;
    }

    private static SinglyLL.Node findMid(SinglyLL.Node head) {
        SinglyLL.Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        if(count%2==0){
            for (int i = (count/2)+1; i <= count; i++) {
                temp = temp.next;
            }
        }
        else{
            for (int i = 0; i < count/2; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

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
