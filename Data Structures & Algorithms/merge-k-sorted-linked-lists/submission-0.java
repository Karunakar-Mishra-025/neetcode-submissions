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
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-heap: smallest node value comes first
        PriorityQueue<ListNode> minHeap =
            new PriorityQueue<>((a, b) ->
                Integer.compare(a.val, b.val));

        // Add the first node of each non-empty list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy node simplifies building the result
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {

            // Get the smallest node
            ListNode smallest = minHeap.poll();

            // Attach it to the result
            tail.next = smallest;
            tail = tail.next;

            // Add the next node from the same list
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}
