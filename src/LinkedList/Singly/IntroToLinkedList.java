package LinkedList.Singly;

public class IntroToLinkedList {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insert(4);
        list.insert(5);
        list.insert(1);
        list.insert(9);

        list.display();

        list.insert(3,3);
        list.display();
        list.insert(2, 4);
        list.display();
    }
}
