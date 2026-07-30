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
    public ListNode kn(ListNode head,int k){
        ListNode temp = head;
        int count =1;
      while(temp!=null && count<k){
         temp=temp.next;
         count++;
      }
      if(count>=k){
        return temp;
      } else {
        return null;
      }
    }
    public ListNode reverse(ListNode head){
       ListNode prev = null;
       ListNode temp = head;
       while(temp!=null){
        ListNode next = temp.next;
         temp.next = prev;
         prev=temp;
         temp=next;
       }
       return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode next =null;
        while(temp!=null){
            ListNode knode = kn(temp,k);
            if(knode==null){
             if(prev!=null)prev.next = temp;
              break;
            } 
            if(temp==head){
                head=knode;
            }
             next = knode.next;
             knode.next = null;
             reverse(temp);
             if(prev!=null) prev.next = knode;
             prev = temp;
             temp=next;
        }
        return head;
    }
}