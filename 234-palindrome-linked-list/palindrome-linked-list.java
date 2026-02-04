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
         ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
          
        }
        
       ListNode middle = slow; 
        ListNode chk ;
          chk = reverse(middle.next);
       ListNode temp = head;
        while(temp!=null && chk!=null ){
            if(temp.val!=chk.val){
                return false;
            }
            temp=temp.next;
            chk=chk.next;
        }
       return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head;
        while(curr!=null){
          temp = curr.next;
           curr.next=prev;
           prev = curr;
           curr=temp;
        }
        return prev;
    }
}