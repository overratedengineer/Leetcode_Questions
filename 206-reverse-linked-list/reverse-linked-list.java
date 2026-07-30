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
    static ListNode newHead = null;
    public ListNode reverse (ListNode head){
        if(head==null || head.next==null) return newHead=head;
        reverse(head.next).next = head;
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        reverse(head);
        temp.next=null;
        return newHead;

    }
}