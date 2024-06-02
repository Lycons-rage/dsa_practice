package LinkedList.Singly;

class SinglyLL {
    Node head;
    Node tail;
    int size;

    public SinglyLL(){
        this.size = 0;
    }

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        //will be inserting at the end only
        if(this.head==null){
            head = new Node(data);
            if(tail == null) {
                tail = head;
            }
        }
        else{
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : "+size);
    }
}
