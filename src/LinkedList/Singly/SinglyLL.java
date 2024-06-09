package LinkedList.Singly;

public class SinglyLL {
    public Node head;
    public Node tail;
    public int size;

    public SinglyLL(){
        this.size = 0;
    }

    public class Node{
        int val;
        public Node next;

        public Node(int data){
            this.val = data;
        }

        public Node(int data, Node next){
            this.val = data;
            this.next = next;
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
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : "+size);
    }

    public void insert(int data, int pos){
        head = insertRec(pos, data, head);
    }

    private Node insertRec(int index, int val, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(--index, val, node.next);
        return node;
    }
}
