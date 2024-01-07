package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class L_155_MinStack {

        // int min = Integer.MAX_VALUE;
        Stack<Integer> stack;
        Stack<Integer> minimumStack;
        public L_155_MinStack() {
            stack = new Stack<Integer>();
            minimumStack = new Stack<Integer>();
        }

        public void push(int val) {
            // if(val < min){
            //     minimumStack.push(val);
            //     min = val;
            // }else{
            //     minimumStack.push(min);
            // }
            stack.push(val);
            if(!minimumStack.isEmpty() && val > minimumStack.peek() ){
                val = minimumStack.peek();
            }
            minimumStack.push(val);


        }

        public void pop() {
            stack.pop();
            minimumStack.pop();
            //    if (!minimumStack.isEmpty()){
            //         min = minimumStack.peek();
            //    }else{
            //        min = Integer.MAX_VALUE;
            //    }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minimumStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

