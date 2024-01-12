package LeetCode.LinkedList;

// Definition for singly-linked list.

class L_21_MergeTwoSortedLists {

    public static void main(String[] args){
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4, null)));
        ListNode result = mergeTwoLists(l1,l2);

        while (result != null){
            System.out.println("res "+result.val);
            result =result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode ans = result;
        // Iterative way
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                result.next = new ListNode(curr1.val);
                curr1 = curr1.next;
            }else{
                result.next = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            result = result.next;
        }

        // For remaining elements

        if(curr1 != null){
            result.next = curr1;

        }

        if(curr2 != null){
            result.next = curr2;
        }

        return ans.next;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}