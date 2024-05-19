package binaeryTree.traversals;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public BinaryTreeLevelOrderTraversal(){}

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner s){
        if(root == null){
            System.out.print("Enter Value for the root node : ");
            int val = s.nextInt();
            root = new Node(val);
        }
        populate(s, root);
    }

    private void populate(Scanner s, Node root){
        //left child
        System.out.println("Left child of "+root.val+" ?");
        boolean left = s.nextBoolean();
        if(left){
            System.out.print("Enter vale for left child : ");
            int val = s.nextInt();
            root.left = new Node(val);
            populate(s, root.left);
        }

        //right child
        System.out.println("Right child of "+root.val+" ?");
        boolean right = s.nextBoolean();
        if(right){
            System.out.print("Enter vale for right child : ");
            int val = s.nextInt();
            root.right = new Node(val);
            populate(s, root.right);
        }
    }

    public List<List<Integer>> display(){
        System.out.println("Level Order Traversal : ");
        List<Integer> out = new ArrayList<>();
        return levelOrder(root, out);
    }

    private List<List<Integer>> levelOrder(Node root, List<Integer> output){
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> out = new LinkedList<List<Integer>>();
        if(root == null) return out;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if(i%2==0) {
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                }
                else{
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            out.add(sublist);
        }
        return out;
    }
}
