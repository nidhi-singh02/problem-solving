package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class L_1290_ConvertBinaryNumberInALinkedListToInteger {


    public static void main(String[] args){
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1))) ;
       int result =  getDecimalValue(head);
       System.out.println("result final: "+result);
    }
//     * Definition for singly-linked list.
     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public static int getDecimalValue(ListNode head) {

            // Traverse the LinkedList and store the values in an array
            List<Integer> res = new ArrayList<>();
            int i=0;
            while(head != null)
            {
                res.add(head.val);
                head = head.next;
            }
            System.out.println("res:"+res);
           return convertBaseToDecimal(res);
        }

        static int convertBaseToDecimal(List<Integer> input){
        int result = 0;
        for(int i=0;i < input.size();i++){
           result = (int) (result + Math.pow(2,input.size()-1-i)*input.get(i));
        }

        return result;
        }

}
