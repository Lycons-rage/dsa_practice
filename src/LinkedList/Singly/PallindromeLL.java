package LinkedList.Singly;

public class PallindromeLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.display();

        System.out.println(checkPallindrome(list.head));
    }

    private static boolean checkPallindrome(SinglyLL.Node head) {
        //find mid
        SinglyLL.Node mid = findMid(head);

        //reverse second half
        SinglyLL.Node secondHead = reverseLL(mid);
        SinglyLL.Node revHead = secondHead;

        while (head!=null && secondHead!=null){
            if(head.val != secondHead.val){
                break;
            }
            head=head.next;
            secondHead = secondHead.next;
        }

        return head == null || secondHead == null;
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
