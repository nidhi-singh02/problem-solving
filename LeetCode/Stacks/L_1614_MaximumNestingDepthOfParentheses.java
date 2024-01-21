package Stacks;

import java.util.Stack;

public class L_1614_MaximumNestingDepthOfParentheses {
    public static void main(String[] args) {
        System.out.println("result: "+maxDepth("(1)+((2))+(((3)))"));
    }
    public static int maxDepth(String s) {
//        int nestedMaxDepth = 0;
//        int currentDepth = 0;
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//
//        for(char c:chars){
//            if(c == '('){
//                stack.push(c);
//                currentDepth++;
//            }else if(c == ')') {
//                stack.pop();
//                currentDepth--;
//            }
//            nestedMaxDepth = Math.max(nestedMaxDepth,currentDepth);
//        }
//        return nestedMaxDepth;

        //Second approach

//        char[] chars = s.toCharArray();
//        int l = 0, r = s.length()-1;
//        int nestedMaxDepth = 0;
//        int openCount = 0;
//
//        while(l <= r){
//            if(chars[l] == '('){
//                openCount++;
//            }else if(chars[l] == ')'){
//                openCount--;
//            }
//            nestedMaxDepth = Math.max(nestedMaxDepth,openCount);
//            l++;
//        }
//
//        return nestedMaxDepth;

        int nestedMaxDepth = 0;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c:chars){
            if(c == '('){
                stack.push(c);
                nestedMaxDepth = Math.max(nestedMaxDepth,stack.size());
            }else if(c == ')') {
                stack.pop();
            }

        }
        return nestedMaxDepth;
    }
}
