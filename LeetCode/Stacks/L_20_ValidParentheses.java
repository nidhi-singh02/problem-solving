package Stacks;

import java.util.Stack;

class L_20_ValidParentheses {

    public static void main(String[] args) {
        String input = "[{}]";
        System.out.println("Is valid: " + isValid(input));
    }

    public static boolean isValid(String s) {

                Stack<Character> occured = new Stack<>();

                char[] CharArray = s.toCharArray();
                if (CharArray.length == 1)
                    return false;

                for (int i = 0; i < CharArray.length; i++) {
                    if (CharArray[i] == '(' || CharArray[i] == '[' || CharArray[i] == '{') {
                        occured.push(CharArray[i]);
                    } else {
                        if (occured.isEmpty()) {
                            return false;
                        }

                        char lastElem = occured.peek();

                        if (CharArray[i] == ')' && lastElem == '(' || (CharArray[i] == ']' && lastElem == '[') || (CharArray[i] == '}' && lastElem == '{')) {
                            occured.pop();
                        } else {
                            return false;

                        }
                    }
                }

                return occured.isEmpty();

            }
        }