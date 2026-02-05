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
    public ListNode middle(ListNode head){
      ListNode slow=head;
      ListNode fast=head.next;
      while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      }
      return slow;
    }
    public ListNode mergesort(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode mid = middle(head);
            ListNode right = mid.next;
            mid.next=null;
            head=mergesort(head);
            right=mergesort(right);
           return merge(head,right);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode i =left;
        ListNode j =right;
        ListNode dummy = new ListNode(-1,null);
        ListNode temp = dummy;
        while(i!=null && j!=null){
            if(i.val<j.val){
               dummy.next=i;
               i=i.next;
            } else {
                dummy.next =j;
                j=j.next;
            }
            dummy=dummy.next;
        }
        while(i!=null){
          dummy.next=i;
               i=i.next;
                 dummy=dummy.next;
        }
        while(j!=null){
            dummy.next =j;
                j=j.next;
              dummy=dummy.next;
        }
        return temp.next;
    }
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
}