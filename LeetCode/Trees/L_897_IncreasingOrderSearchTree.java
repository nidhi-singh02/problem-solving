package LeetCode.Trees;

import java.util.ArrayList;
import java.util.List;

public class L_897_IncreasingOrderSearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1, null,null),null),new TreeNode(4,null,null)), new TreeNode(6,null, new TreeNode(8, new TreeNode(7,null,null), new TreeNode(9,null,null))));
        System.out.println("result: "+increasingBST(root));
    }
   

    public static TreeNode increasingBST(TreeNode root) {
        // traverse the tree
        List<Integer> array = new ArrayList<>();
            treeTraversal(root,array);
           TreeNode dummy = null;
           TreeNode result = null;
        for (Integer integer : array) {
            if (dummy != null) {
                dummy.right = new TreeNode(integer);
                dummy = dummy.right;
            } else {
                dummy = new TreeNode(integer);
                result = dummy;
            }

        }

            return result;
    }

//    public TreeNode increasingBST(TreeNode root) {
//        List<Integer> array = new ArrayList<>();
//        treeTraversal(root, array);
//        TreeNode dummy = new TreeNode(-1);
//        TreeNode result = dummy; // also works
//        for (int i = 0; i < array.size(); i++) {
//            dummy.right = new TreeNode(array.get(i));
//            dummy = dummy.right;
//        }
//
//        return result.right;
//    }

    private static void treeTraversal(TreeNode root, List<Integer> array){
        if(root == null){
            return;
        }
        treeTraversal(root.left,array);
        array.add(root.val);
        treeTraversal(root.right,array);
    }
}
