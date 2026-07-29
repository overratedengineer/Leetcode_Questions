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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev = null;
        ListNode h2 = null;
        while(temp!=null){
            if(temp.next==null) h2 = temp;
           ListNode next = temp.next;
           temp.next=prev;
           prev=temp;
           temp=next;
        } 
        return h2;
    }
    public ListNode kn(ListNode head ,int k){
        int count = 1;
        ListNode temp=head;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(count==k) 
        return temp;
        else 
        return null;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        // first is to find k elements and pass it to reverse
       //1-2-3 4-5-6 7-8-9
       ListNode temp = head;
       ListNode prev = null;
       ListNode next = null;
       while(temp!=null){
         ListNode knode = kn(temp,k);
         if(knode==null){
         if(prev!=null) prev.next=temp;
         break;
         }
         next = knode.next;
         knode.next=null;
         reverse(temp);
         if(temp==head){
            head=knode;
         } else {
         prev.next = knode;
         }  
         prev=temp;
         temp=next;
       }
       return head;
    }
}       