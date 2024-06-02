package LinkedList.Doubly;

public class DoublyLL {
    Node head;
    int size;

    class Node{
        int val;
        Node prev;
        Node next;

        public Node(int data){
            this.val = data;
        }
    }

    public DoublyLL(){
        this.size = 0;
    }

    public void insert(int data, int pos){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
        }
        else {
            switch (pos) {
                case 1:
                    //insert at beginning
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                    size++;
                    break;
                case 2:
                    //insert at end
                    Node temp = head;
                    while (temp.next!=null){
                        temp = temp.next;
                    }
                    newNode.prev = temp;
                    temp.next = newNode;
                    size++;
                    break;
                case 3:
                    System.out.println("UNDER CONSTRUCTION");
                    break;
                default:
                    System.out.println("INVALID POSITION");
                    break;
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" <-> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : "+size);
    }
}
