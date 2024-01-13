package LeetCode.Trees;

public class L_700_SearchInBinarySearchTree {

    public static void main(String[] args){
        TreeNode root = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        searchBST(root,2);
    }

    static TreeNode result;
    public static TreeNode searchBST(TreeNode root, int val) {
            // Traverse the tree - DFS and BFS
            // In-order traversal
         traverse(root,val);
         return result;

    }

    static void traverse(TreeNode root,int val){
        if(root == null){
            return;
        }
        traverse(root.left,val);
       if (root.val == val){
           result = root;
       }
        traverse(root.right,val);

    }
}

