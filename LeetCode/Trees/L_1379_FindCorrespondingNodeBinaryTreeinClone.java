package LeetCode.Trees;

public class L_1379_FindCorrespondingNodeBinaryTreeinClone {

    public static void main(String[] args){
        TreeNode original =  new TreeNode(7,new TreeNode(4,null,null),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(19,null,null)));
        TreeNode cloned =  new TreeNode(7,new TreeNode(4,null,null),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(19,null,null)));
        TreeNode target =  new TreeNode(3,new TreeNode(6,null,null),new TreeNode(19,null,null));

        System.out.println("res:"+getTargetCopy(original,cloned,target));
    }
    public static TreeNode result;
    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        // Traverse the cloned tree to find the target
        traverse(original,cloned,target);
        return result;

    }

     static void traverse(TreeNode original, TreeNode cloned, TreeNode target){

        if(original == null){
            return;
        }
        if(original.val == target.val){
            result = cloned;
        }
        traverse(original.left,cloned.left, target);

        traverse(original.right,cloned.right, target);

    }
}
