/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode curr = head;
        int count = 0;

        // Check whether there are at least k nodes
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // Reverse only if a complete group of k nodes exists
        if (count == k) {
            curr = reverseKGroup(curr, k);

            // Reverse the current group
            while (count > 0) {
                ListNode next = head.next;
                head.next = curr;
                curr = head;
                head = next;
                count--;
            }

            head = curr;
        }

        return head;
    }
}
