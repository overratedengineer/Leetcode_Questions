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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
         ListNode temp = slow.next;
         slow.next = null;
         ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        temp=head;
         while(temp!=null && prev!=null){
            if(temp.val!=prev.val){
                return false;
            }
            temp=temp.next;
            prev=prev.next;
         }
         if(prev!=null){
            return false;
         }
          return true;
    }
}