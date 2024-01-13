package LeetCode.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
 * Definition for a binary tree node.*/
class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
      }
  }

class L_938_RangeSumOfBST {

    public static void main(String[] args){
        TreeNode input = new TreeNode(10,new TreeNode(5,new TreeNode(3,null,null),new TreeNode(7,null,null)),new TreeNode(15,null, new TreeNode(18,null,null)));
        int result = rangeSumBST(input,7,15);
        System.out.println("result: "+result);
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {

        // Time complexity - O(n)
        // Space complexity - O(n)
//        int sum=0;
//        List<Integer> sortedArray = new ArrayList<>();
//         inOrderTraversal(root,sortedArray);
//        System.out.println("sortedArray"+sortedArray);
//        // Since the tree is a BST, doing in-order traversal will get us sorted array
//        // In-order traversal -> left -> root -> right
//
//        for(Integer i:sortedArray){
//            if(i >= low && i <= high){
//                sum = sum + i;
//            }
//        }
//        return sum;

        // Second approach

        if( root == null){
            return 0;
        }

        if(root.val > high) {
           return rangeSumBST(root.left,low,high);
        }

        if(root.val < low){
            return rangeSumBST(root.right,low,high);
        }

        return root.val + rangeSumBST(root.left,low,high)+ rangeSumBST(root.right,low,high);


    }



    private static void inOrderTraversal(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left,arr);
        arr.add(root.val);
        inOrderTraversal(root.right,arr);
    }
}
