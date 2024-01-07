package Stacks;

import java.util.Stack;

public class L_150_EvaluateReversePolishNotation {

      public static void main(String[] args){
//          String[] input = new String[]{"2","1","+","3","*"};
//          String[] input = new String[]{  "4","13","5","/","+"};
          String[] input = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
          System.out.println("result: "+evalRPN(input));
      }
        public static int evalRPN(String[] tokens) {
            Stack<String> stack = new Stack<>();
            for(String s:tokens){
                if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
                    int secondElem = Integer.parseInt(stack.pop());
                    int firstElem = Integer.parseInt(stack.pop());
                    int result = switch (s) {
                        case "+" -> firstElem + secondElem;
                        case "-" -> firstElem - secondElem;
                        case "*" -> firstElem * secondElem;
                        default -> firstElem / secondElem;
                    };
                    stack.push(String.valueOf(result));
                }else{
                    stack.push(s);
                }
            }

          return Integer.parseInt(stack.peek());

        }
    }

