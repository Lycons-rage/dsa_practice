package LinkedList.Singly;

public class RotateList {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();

        list.head = rotateKTimes(list.head, 2);

        list.display();
    }

    private static SinglyLL.Node rotateKTimes(SinglyLL.Node head, int k) {
        if(k<=0 || head == null || head.next==null){
            return head;
        }
        //find length
        int len = 1;
        SinglyLL.Node last = head;
        while(last.next!=null){
            len++;
            last=last.next;
        }

        for (int i = 0; i < k%len; i++) {
            SinglyLL.Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            SinglyLL.Node req = deleteFromEnd(temp);
            head = insertIntoHead(req, head);
        }

        return head;
    }

    private static SinglyLL.Node insertIntoHead(SinglyLL.Node req, SinglyLL.Node head) {
        req.next = head;
        head = req;
        return head;
    }

    private static SinglyLL.Node deleteFromEnd(SinglyLL.Node node){
        SinglyLL.Node req = node.next;
        node.next = null;
        return req;
    }
}
