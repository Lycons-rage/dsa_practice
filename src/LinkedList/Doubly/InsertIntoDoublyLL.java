package LinkedList.Doubly;

public class InsertIntoDoublyLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();

        list.insert(3,1);
        list.insert(8,1);
        list.insert(2,2);
        list.insert(5,1);
        list.insert(4,2);

        list.display();
    }
}
