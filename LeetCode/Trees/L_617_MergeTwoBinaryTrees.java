package LeetCode.Trees;

public class L_617_MergeTwoBinaryTrees {
    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2));
        TreeNode root2 = new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7)));
        mergeTrees(root1,root2);
    }

    // TreeNode result;
    // Should not use global variable, it will mess up with the result
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // Traverse both the trees
        // If nodes are overlapping, sum the value
        // If no overlap, the value as it is
        return traverse( root1,  root2);
    }

    private static TreeNode traverse(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 == null){
            return null;
        }

        int v1 = 0,v2 = 0;
        if (root1 != null){
            v1 = root1.val;
        }

        if (root2 !=null){
            v2 = root2.val;
        }
        TreeNode result= new TreeNode(v1+v2);
        TreeNode left1=null,left2=null;

        if (root1 != null){
            left1 = root1.left;
        }
        if (root2 != null){
            left2 = root2.left;
        }
        result.left = traverse(left1,left2);
        TreeNode right1=null,right2=null;

        if (root1 != null){
            right1 = root1.right;
        }
        if (root2 != null){
            right2 = root2.right;
        }
        result.right = traverse(right1,right2);

        return result;
    }
}
