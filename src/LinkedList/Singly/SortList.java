package LinkedList.Singly;

public class SortList {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(5);

        list.display();

        list.head = mergeSort(list.head);

        list.display();
    }

    private static SinglyLL.Node mergeSort(SinglyLL.Node head) {
        //merge sort code....make it recursive? why not
        // breakpoint
        if(head.next == null){
            return head;
        }
        // get length and reach to half
        int len = 1;
        SinglyLL.Node temp = head;
        while(temp.next!=null){
            len++;
            temp = temp.next;
        }
        //now we have current list's length
        //reach to half
        temp = head;
        SinglyLL.Node h2 = head;
        for (int i = 0; i < len/2-1; i++) {
            temp = temp.next;
        }
        // in a ll such as this, 3 -> 1 -> 2 -> 5
        //                            ^
        //                        temp is here

        h2 = temp.next;
        temp.next = null;
        // link is broken and head 2 is now on beginning on the second part
        //left and right part recursive calls
        SinglyLL.Node left = mergeSort(head);
        SinglyLL.Node right = mergeSort(h2);

        // when both these recursive calls end we'll be having 2 sub-lists both having a single node, we gotta merge them now
        head = mergeNodes(left, right);
        return head;
    }

    private static SinglyLL.Node mergeNodes(SinglyLL.Node left, SinglyLL.Node right) {
        SinglyLL dummy = new SinglyLL();
        dummy.insert(0);
        SinglyLL.Node curr = dummy.head;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        curr.next = (left != null) ? left : right;
        return dummy.head.next;
    }
}
