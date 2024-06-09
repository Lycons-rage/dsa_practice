package LinkedList.Singly;

public class mergeLIsts {
    public static void main(String[] args) {
        SinglyLL list1 = new SinglyLL();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);

        SinglyLL list2 = new SinglyLL();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);

        SinglyLL ans;
        ans = mergeLists(list1.head, list2.head);

        ans.display();
    }

    static SinglyLL mergeLists(SinglyLL.Node head1, SinglyLL.Node head2) {
        SinglyLL ans = new SinglyLL();
        while(head1!=null && head2!=null){
            if(head1.val <= head2.val){
                ans.insert(head1.val);
                head1 = head1.next;
            }else{
                ans.insert(head2.val);
                head2 = head2.next;
            }
        }

        while(head1!=null){
            ans.insert(head1.val);
            head1 = head1.next;
        }
        while(head2!=null){
            ans.insert(head2.val);
            head2 = head2.next;
        }
        return ans;
    }
}
