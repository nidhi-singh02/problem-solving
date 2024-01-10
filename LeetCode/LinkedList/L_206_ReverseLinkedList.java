package LeetCode.LinkedList;

public class L_206_ReverseLinkedList {
    public static class ListNode {
        int val;
        L_206_ReverseLinkedList.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, L_206_ReverseLinkedList.ListNode next) { this.val = val; this.next = next; }
    }

        public ListNode reverseList(ListNode head) {
            // Follow iterative approach using two-pointer mechanism
            // Two pointers = current pointer starts at head and
            // prev pointer will be null as there is no element before head

            ListNode current = head;
            ListNode prev = null;
            while (current != null){
                ListNode next = current.next;
                current.next = prev;
                // next.next = current;
                prev = current;
                current = next;
            }

            return prev;
        }
    }

