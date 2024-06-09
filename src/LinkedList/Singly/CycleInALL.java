package LinkedList.Singly;

public class CycleInALL {
    public static void main(String[] args) {
        //fast and slow pointer approach
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(4);

        list.display();

        SinglyLL.Node fast = list.head;
        SinglyLL.Node slow = list.head;

        int length = 1;
        while(fast!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                slow = slow.next;
                while(slow != fast){
                    length++;
                    slow = slow.next;
                }
                break;
            }
        }

        fast = list.head;
        slow = list.head;

        while(length>0) {
            slow = slow.next;
            length--;
        }

        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }

        System.out.println(fast.val);
    }
}
