package binaeryTree.medium;

import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Root : "+arr[i]);
            System.out.println("left child : " + arr[2 * i]);
            System.out.println("right child : " + arr[2 * i + 1]);
            if(2*i+1 == arr.length-1 || 2*i == arr.length){
                break;
            }
        }
    }

    static int diameter = 0;

//    public static int diameterOfBinaryTree(TreeNode root) {
//
//    }
//
//    private static int dfs(TreeNode root){
//        if (root == null){
//            return -1;
//        }
//
//        int left = dfs(root.left);
//        int right = dfs(root.right);
//
//        diameter = Math.max(diameter, 2+left+right);
//        return diameter;
//    }
}
