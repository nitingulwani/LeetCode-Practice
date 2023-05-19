class reverseLL2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        
        for(int i = 0; i<left-1; i++){
            prev = prev.next;
            curr=curr.next;
        }
        
        for(int i = 0; i<right-left; i++){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }
}