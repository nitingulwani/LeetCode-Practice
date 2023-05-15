class swapNodes {
    public ListNode swapNodes(ListNode head, int k) {	

        ListNode temp1= head;
        int count = 1;
        while(count != k){
            temp1 = temp1.next;
            count++;
        }
        ListNode first = temp1;
        ListNode second = head;
        while(temp1.next != null){
            temp1 = temp1.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
      // int size = 0;
        // ListNode curr = head;
    
        // while(curr.next!=null){
        //     curr = curr.next;
        //     size++;
        // }

        // int arr[] = new int[size];
        // for(int i = 0; i<arr.length; i++){
        //     while(cur.next!=null){
        //         curr = curr.next;
        //         arr[]
        //     }
        // }

        // int temp = list[k];
        // list[k] = list[size-k];
        // list[size-k] = temp;

        // LinkedList<Integer> list = new List<>();

        // return list;

    }
}