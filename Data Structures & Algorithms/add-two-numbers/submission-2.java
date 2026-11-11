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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // int num1=0,num2=0;
        // ListNode temp=l1;
        // int count=0;
        // while(temp!=null){
        //     num1 += temp.val * (int)Math.pow(10, count);
        //     temp=temp.next;
        //     count++;
        // }
        // System.out.println(num1+" ");
        // temp=l2;
        // count=0;
        // while(temp!=null){
        //     num2 += temp.val * (int)Math.pow(10, count);
        //     temp=temp.next;
        //     count++;
        // }
        // System.out.println(num2+" ");
        // int sum=num1+num2;
        // if (sum == 0) {
        //     return new ListNode(0);
        // }
        // ListNode result = new ListNode();
        // ListNode head = null;
        // ListNode current = null;

        // while (sum > 0) {
        //     int digit = sum % 10;
        //     ListNode newNode = new ListNode(digit);

        //     if (head == null) {
        //         head = newNode;
        //         current = newNode;
        //     } else {
        //         current.next = newNode;
        //         current = current.next;
        //     }

        //     sum /= 10;
        // }

        // return head;
         int carry = 0;

        ListNode head = null;
        ListNode current = null;

        while (l1 != null || l2 != null || carry != 0) {

            int num1 = 0;
            int num2 = 0;

            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            int sum = num1 + num2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }
}
