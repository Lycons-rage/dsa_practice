package LinkedList.Singly;

public class AddTwoNos {
    public static void main(String[] args) {
        SinglyLL l1 = new SinglyLL();
        SinglyLL l2 = new SinglyLL();

        l1.insert(0);
        l1.display();

        l2.insert(0);
        l2.display();

        l1.head = addTwo(l1.head, l2.head);

        l1.display();
    }

    private static SinglyLL.Node addTwo(SinglyLL.Node l1, SinglyLL.Node l2) {
        SinglyLL ans = new SinglyLL();
        ans.head = null;
        if(l1==null){
            if(l2 == null){
                return null;
            }
        }

        int sum = 0;
        int answer = 0;
        int carry = 0;
        //for common nodes
        while(l1 != null && l2 != null){
            sum = l1.val+l2.val+carry;
            if(sum>9){
                answer = sum%10;
                carry = sum%9;
                ans.insert(answer);
            } else {
                ans.insert(sum);
                carry = 0; //reset carry
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        //if sizes extends
        while(l1!=null){
           sum = l1.val+carry;
           if(sum>9){
                answer = sum%10;
                carry = sum%9;
                ans.insert(answer);
           } else {
                ans.insert(sum);
                carry = 0; //reset carry
           }
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val+carry;
            if(sum>9){
                answer = sum%10;
                carry = sum%9;
                ans.insert(answer);
            } else {
                ans.insert(sum);
                carry = 0; //reset carry
            }
            l2 = l2.next;
        }

        return ans.head;
    }
}
