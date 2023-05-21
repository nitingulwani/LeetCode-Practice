class deleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        if(head == null || head.next == null) return null;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // ListNode curr = head;
        // while(curr.next!=slow){
        //     curr = curr.next;
        // }
        // prev.next = prev.next.next;
      
        slow.next  = slow.next.next;

        return head;

        
    }
}
