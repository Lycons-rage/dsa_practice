package binaeryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Practice {
    //constructor to initialise tree class
    public Practice(){}

    //node structure
    private static class Node{
        int val;
        Node left;
        Node right;

        //constructor to initialise every node
        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    //populating the tree
    public void populate(Scanner s){
        if(root == null){
            System.out.println("Enter value for root node : ");
            int value = s.nextInt();
            root = new Node(value);
        }
        populate(s, root);
    }

    private void populate(Scanner s, Node node) {
        //left node
        System.out.println("Wanna go left of "+node.val+" ?");
        boolean left = s.nextBoolean();
        if(left){
            System.out.print("Enter value for node : ");
            int val = s.nextInt();
            node.left = new Node(val);     //defining new node at previous node's left
            populate(s, node.left);
        }

        //right node
        System.out.println("Wanna go right of "+node.val+" ?");
        boolean right = s.nextBoolean();
        if(right){
            System.out.print("Enter value for node : ");
            int val = s.nextInt();
            node.right = new Node(val);
            populate(s, node.right);
        }
    }


    //displaying the tree in pre-order
    public List<Integer> display(){
        List<Integer> out = new ArrayList<>();
        return preOrder(root, out);
    }
    private List<Integer> preOrder(Node root, List out){
        if (root == null){
            return out;
        }
        out.add(root.val);
        // System.out.println(root.val);
        preOrder(root.left, out);
        preOrder(root.right, out);
        return out;
    }
    //optimise the above code

    //main method
    public static void main(String[] args) {
        Practice tree = new Practice();
        Scanner s = new Scanner(System.in);
        tree.populate(s);

        System.out.println("Pre-Order Traversal : ");
        System.out.println(tree.display());
    }
}
