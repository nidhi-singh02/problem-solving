package LeetCode.Trees;

import com.sun.source.tree.Tree;

public class L_104_MaximumDepthOfBinaryTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3, new TreeNode(9,null,null), new TreeNode(20, new TreeNode(15,null,null), new TreeNode(7, null,null)));
        System.out.println("result: "+maxDepth(root));
    }

   static int maxDepth=0;
    public static int maxDepth(TreeNode root) {
        // Traverse the tree, keep counting the depth
//        int currentDepth=0;
//        treeTraversal(root, currentDepth);
//        return maxDepth;

        // Second approach
        if(root == null){
            return 0;
        }
       return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    private static void treeTraversal(TreeNode root,int currentDepth){
        if(root == null){
            return;
        }
        currentDepth++;
        maxDepth = Math.max(maxDepth,currentDepth);
        treeTraversal(root.left, currentDepth);
        treeTraversal(root.right,currentDepth);
    }
}
