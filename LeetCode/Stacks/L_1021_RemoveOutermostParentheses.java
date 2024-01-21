package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class L_1021_RemoveOutermostParentheses {
    public static void main(String[] args) {
        System.out.println("result: "+removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    str.append(c);
                }
                stack.push(c);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
