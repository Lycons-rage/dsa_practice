package LinkedList.Singly;

public class OddEvenSeperate {
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

        list.head = seperateOddEven(list.head);

        list.display();
    }

    private static SinglyLL.Node seperateOddEven(SinglyLL.Node head) {
        SinglyLL.Node prev = null;
        SinglyLL.Node current = head;
        SinglyLL.Node temp = current;

        //find Last
        SinglyLL.Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        SinglyLL.Node terminator = last;
        //last is at the terminating node now

        int count = 1;
        while(current!=terminator) {
            if (count % 2 == 0) {
                temp = current;
                last.next = temp;
                last = last.next;
                prev.next = current.next;
                current = current.next;
                temp.next = null;
            } else {
                prev = current;
                current = current.next;
            }
            count++;
        }
        if(count%2==0){
            temp=current;
            last.next = temp;
            prev.next = current.next;
            temp.next = null;
        }
        return head;
    }
}
