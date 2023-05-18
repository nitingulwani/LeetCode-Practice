//Here we reverse the second half of the list and then compare it with the elements of the first half

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Get middle of the linked list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half of the linked list.
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode start = head;
        int maximumSum = 0;
        while (prev != null) {
            maximumSum = Math.max(maximumSum, start.val + prev.val);
            prev = prev.next;
            start = start.next;
        }

        return maximumSum;
    }
}

// class Solution {
//     public int pairSum(ListNode head) {
//         ListNode first = head;
//         ListNode second = first;
//         int n = 0,sum=0;
//         ListNode temp = head;
        
//         while(temp.next!=null){
//             temp = temp.next;
//             n++;
//         }

//         for(int i = 0;i<n/2; i++){
//             reverse(head);
//         }

//         for(int i = 0;i<n/2; i++){
//             sum+=
//         }

//     }
//     public ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode curr=head;
//         ListNode temp;

//         while(curr.next!=null){
//             temp=curr.next;
//             curr.next.=prev;
//             prev=curr;
//             curr=temp;
//         }
//         return prev;
//     }
// }