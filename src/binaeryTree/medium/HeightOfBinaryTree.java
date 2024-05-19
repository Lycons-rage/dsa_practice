package binaeryTree.medium;

import java.util.Scanner;

public class HeightOfBinaryTree {
    public HeightOfBinaryTree(){}

    //Tree Structure
    private static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }

    private TreeNode root;

    //inserting values
    public void populate(Scanner s){
        if(root == null){
            System.out.print("Enter value of the root node : ");
            int value = s.nextInt();
            root = new TreeNode(value);
        }
        populate(s, root);
    }
    private void populate(Scanner s, TreeNode root){
        //left child
        System.out.print("Wanna go left of "+root.value+" ?");
        boolean left = s.nextBoolean();
        if(left){
            System.out.print("Enter value of the node : ");
            int val = s.nextInt();
            root.left = new TreeNode(val);
            populate(s, root.left);
        }
        //right child
        System.out.println("Wanna go right of "+root.value+" ?");
        boolean right = s.nextBoolean();
        if(right){
            System.out.print("Enter value of the node : ");
            int val = s.nextInt();
            root.right = new TreeNode(val);
            populate(s, root.right);
        }
    }

    //height of binary tree
    public int height(){
        return dfs(root);
    }
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        Scanner s = new Scanner(System.in);
        tree.populate(s);

        System.out.println("Height : ");
        System.out.println(tree.height());
    }
}
