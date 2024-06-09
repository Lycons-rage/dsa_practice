package LinkedList.Doubly;

import java.util.Scanner;

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
                    System.out.println("AT WHICH POSITION");
                    Scanner s = new Scanner(System.in);
                    int choice = s.nextInt();
                    temp = head;
                    if(choice > size){
                        System.out.println("Invalid choice, inserting in the end");
                        while (temp.next!=null){
                            temp = temp.next;
                        }
                        newNode.prev = temp;
                        temp.next = newNode;
                    }
                    else{
                        for (int i = 1; i < choice-1; i++) {
                            temp = temp.next;
                        }
                        newNode.next = temp.next;
                        temp.next.prev = newNode;
                        temp.next = newNode;
                        newNode.prev = temp;
                    }
                    size++;
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

    public void reverse(){
        if(head == null){
            System.out.println("Nothing to reverse");
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            for (int i = 0; i <size; i++) {
                head = temp;
                temp.next=temp.prev;
                
                temp.prev.prev=temp;
                head.prev = null;
            }
        }
    }
}
