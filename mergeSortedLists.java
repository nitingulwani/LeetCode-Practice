public class mergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);        
        ListNode ans = dummy;

        while(l1!=null && l2!= null){
            if(l1.val <l2.valtwo){
                ans.next=l1;
                ans = ans.next;
                l1 = l1.next;
            }
           
            else{
                ans.next = l2;
                ans = ans.next;
                
                l2 = l2.next;
            }
        }
        while(l1!=null){
            ans.next = l1;
            ans = ans.next;
            l1 = l1.next;
        }
         while(l2!=null){
            ans.next = l2;
            ans = ans.next;
            l2 = l2.next;
        }
        return dummy.next;
    }
}