package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class L_277_BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println("result :"+calculate("0-2147483647"));
    }

    public static int calculate(String s) {
        int result = 0;
       s=  s.replaceAll(" ","");
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        List<Character> operator= new ArrayList<>();
       String[] formattedStr = s.split("[-*+//]");
        if(formattedStr.length > 0){
            for(String c:formattedStr) {
                    stack.push(Integer.parseInt(c));
                }

            for(char c:chars) {
                if (c != '+' && c != '-' && c != '*' && c != '/') {
                } else {
                    operator.add(c);
                }
            }
        }else{
            for(char c:chars) {
                if (c != '+' && c != '-' && c != '*' && c != '/') {
                    int a = c - '0';
                    stack.push(a);
                } else {
                    operator.add(c);
                }
            }
        }

        System.out.println("stack:" + stack);

        if(operator.isEmpty()){
            return Integer.parseInt(s);
        }
            while(stack.size() > 1  && !operator.isEmpty()){
                if(operator.getLast() == '+'){
                    result = stack.pop() + stack.pop();
                } else if(operator.getLast() == '*'){
                    result = stack.pop() * stack.pop();
                }else if(operator.getLast() == '-'){
                    int secondDigit = stack.pop();
                    result = stack.pop() - secondDigit;
                }else if(operator.getLast() == '/'){
                    int secondDigit = stack.pop();
                    result = stack.pop() / secondDigit;
                }
                operator.removeLast();
                stack.push(result);
            }

        return stack.peek();
    }
}
