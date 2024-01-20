package LeetCode.Trees;

import java.util.ArrayList;
import java.util.List;

public class L_872_LeafSimilarTrees {
    public static void main(String[] args){
        TreeNodeL root1 = new TreeNodeL(3, new TreeNodeL(5,new TreeNodeL(6, null, null), new TreeNodeL(2, new TreeNodeL(7), new TreeNodeL(4, null,null))), new TreeNodeL(1, new TreeNodeL(9,null,null), new TreeNodeL(8,null,null)));
        TreeNodeL root2 = new TreeNodeL(3, new TreeNodeL(5,new TreeNodeL(6, null, null), new TreeNodeL(7, null,null)), new TreeNodeL(14, new TreeNodeL(4,null,null),new TreeNodeL(2, new TreeNodeL(9, null,null),new TreeNodeL(8,null,null))));
        System.out.println("result: "+ leafSimilar(root1,root2));
    }

    public static class TreeNodeL {
        int val;
        TreeNodeL left;
        TreeNodeL right;

        TreeNodeL() {
        }

        TreeNodeL(int val) {
            this.val = val;
        }

        TreeNodeL(int val, TreeNodeL left, TreeNodeL right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public static boolean leafSimilar(TreeNodeL root1, TreeNodeL root2) {
            // Traverse the tree with head root1
            // Find nodes who doesn't have any children, get the value of the node

            // In order
            List<Integer> array1 = new ArrayList<>();
            List<Integer> array2 = new ArrayList<>();
            treeTraversal(root1,array1);
            treeTraversal(root2,array2);

            System.out.println("array1: "+array1);
            System.out.println("array2: "+array2);
            return array1.equals(array2);
        }

        private static void treeTraversal(TreeNodeL root, List<Integer> array){
            if(root == null) {
                return;
            }
            treeTraversal(root.left,array);
            if(root.left == null && root.right == null) {
                array.add(root.val);
            }
            treeTraversal(root.right,array);
        }

    }


