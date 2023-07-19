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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev1 = head;
        ListNode prev2 = head;

        for(int i = 1; i<k; i++){
            prev1 = prev1.next;
        }
        ListNode nodeK = prev1;

        prev1=prev1.next;

        // ListNode curr = head;
        // int size = 0;
        while (prev1 != null) {
            prev1 = prev1.next;
            prev2 = prev2.next;
        }

        int temp = nodeK.val;
        nodeK.val = prev2.val;
        prev2.val = temp;

        return head;
    }
}
