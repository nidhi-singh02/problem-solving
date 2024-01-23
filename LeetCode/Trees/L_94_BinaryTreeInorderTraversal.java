package LeetCode.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null, new TreeNode(2,new TreeNode(3),null));
        System.out.println("result:"+inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        inorder(root,result);
//        return result;

        // Second approach - Iterative
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while( curr != null){
                stack.push(curr);
                curr = curr.left ;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;

    }

   private static void inorder(TreeNode root,List<Integer> result) {
       if (root == null) {
           return;
       }
       inorder(root.left, result);
       result.add(root.val);
       inorder(root.right, result);
   }

}
