class reverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
        
    }
}

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         // base case
//         if(head == null || head.next == null) return head;
        
//         ListNode newHead = reverseList(head.next);
        
//         head.next.next = head;
//         head.next = null;

//         return newHead;
//     }
// }