class Solution {

    public ListNode reverse(ListNode head, int k){
        int count=0;
        ListNode temp = head;
        ListNode curr = null;
        ListNode prev = null;

        while(temp!=null && count<k){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
            count++;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(count<k) return head;
        ListNode newHead = reverse(head,k);
        head.next = reverseKGroup(temp,k);

        return newHead;
    }
}
