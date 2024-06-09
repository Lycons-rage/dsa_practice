package LinkedList.Singly;

public class RemoveNthNodeFromBack {
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

        list.head = removeFromEnd(list.head, 6);

        list.display();
    }

    private static SinglyLL.Node removeFromEnd(SinglyLL.Node head, int n) {
        // edge case
        if(head.next == null){
            if(n==1){
                return null;
            }
            return head;
        }

        // solution code
        //get length
        int len = 1;
        SinglyLL.Node temp = head;
        while(temp.next!=null){
            len++;
            temp = temp.next;
        }
        // now we have length
        temp = head;
        if(len-n == 0){
            head = head.next;
        }

        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}
