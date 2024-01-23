package LeetCode.Trees;

import java.util.ArrayList;
import java.util.List;

public class L_590_NaryTreePostorderTraversal {
   static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public static void main(String[] args) {
        Node root = new Node(1,new ArrayList<Node>(List.of(new Node[]{new Node(3), new Node(2), new Node(4)})));
        System.out.println("result: "+postorder(root));


    }
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        post(root, result);
        return result;
    }

    private static void post(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        for (Node child : root.children) {
            post(child, result);
        }

        result.add(root.val);
    }
}
