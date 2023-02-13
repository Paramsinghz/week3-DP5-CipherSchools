/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;

        }
        return false;

    }
}
/*
 * HashMap<ListNode, Boolean> check = new HashMap<>();
 * 
 * if(head == null || head.next == null) return false;
 * 
 * 
 * while(head != null){
 * 
 * if(check.containsKey(head)) return true;
 * 
 * check.put(head, true);
 * head = head.next;
 * 
 * }
 * return false;
 * }
 * }
 */