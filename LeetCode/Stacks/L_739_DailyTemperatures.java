package Stacks;

import java.util.Stack;

public class L_739_DailyTemperatures {

        public int[] dailyTemperatures(int[] temperatures) {

            // For every element, check when do you encounter the larger element

            int[] answer = new int[temperatures.length];
            // O(n*n)- Time complexity - TLE
            // for(int i=0;i < temperatures.length;i++){
            //     int count = 0;
            //     for(int j=i+1;j< temperatures.length;j++){
            //          count++;
            //          if(temperatures[i] < temperatures[j]){
            //             break;
            //          }
            //          if(j == temperatures.length-1){
            //              count = 0;
            //          }
            //     }
            //     answer[i] = count;
            // }
            // return answer;

            // Time Complexity - O(n)
            // Space complexity - O(n)
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i < temperatures.length;i++){
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    answer[stack.peek()] = i - stack.peek() ;
                    stack.pop();
                }
                stack.push(i);
            }

            return answer;

        }
    }

