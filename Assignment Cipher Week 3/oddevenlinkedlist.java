/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null)
            return head;

        ListNode temp = head, even = head.next, left = head.next;

        while (temp.next != null && even.next != null && temp != null && even != null) {

            temp.next = temp.next.next;
            temp = temp.next;
            even.next = even.next.next;
            even = even.next;
        }

        if (temp.next == null || temp.next.next == null) {
            temp.next = left;
        }
        return head;

    }
}