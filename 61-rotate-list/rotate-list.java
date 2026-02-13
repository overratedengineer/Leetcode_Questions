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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode s=head;
        ListNode f=head;
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k=k%c;
        while(f.next!=null && k-->0 ){
            f=f.next;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
}
}