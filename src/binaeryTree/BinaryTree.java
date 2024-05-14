package binaeryTree;

import java.util.Scanner;

class BinaryTree {
    public BinaryTree(){
    }

    private static class Node{
        private int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert element
    public void populate(Scanner s){
        System.out.print("Enter the root node value : ");
        int value = s.nextInt();
        root = new Node(value);

        populate(s, root);
    }


    private void populate(Scanner s, Node node) {
        //first in the LHS
        System.out.println("Do you want to enter left of "+node.value+" ?");
        boolean left = s.nextBoolean();
        if(left){
            System.out.print("Enter the value of the left of "+node.value+" : ");
            int left_value = s.nextInt();
            node.left = new Node(left_value);
            populate(s, node.left);
        }
        //then in the RHS
        System.out.println("Do you want to enter right of "+node.value+" ?");
        boolean right = s.nextBoolean();
        if(right){
            System.out.print("Enter the value of the right of "+node.value+" : ");
            int right_value = s.nextInt();
            node.right = new Node(right_value);
            populate(s, node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void prettydisplay(){
        prettydisplay(root, 0);
    }
    private void prettydisplay(Node node, int level) {
        if(node == null){
            return;
        }
        //go to right-most element first
        prettydisplay(node.right, level+1);
        if(level!=0){
            //not in the root the node is some level down and we have to add that many spaces
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        } else {
            System.out.println(node.value);
        }
        prettydisplay(node.left, level+1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(s);
        bt.display();
        System.out.println("Above representation would look sensible if looked at level-wise");

        bt.prettydisplay();
        System.out.println("Above representation is pretty");
    }
}
