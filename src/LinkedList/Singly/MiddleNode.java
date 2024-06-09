package LinkedList.Singly;

public class MiddleNode {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display();

        SinglyLL.Node temp = list.head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        System.out.println(count);

        if(count%2==0){
            for (int i = (count/2)+1; i <= count; i++) {
                list.head = list.head.next;
            }
        }
        else{
            for (int i = 0; i < count/2; i++) {
                list.head = list.head.next;
            }
        }

        list.display();
    }
}
