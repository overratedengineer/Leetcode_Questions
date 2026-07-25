/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp= head;
        ListNode temp2= head;
        
        while(temp!=null && temp.next!=null){
            temp=temp.next.next;
            temp2=temp2.next;
             if(temp==temp2){
                return true;
            }
        }
        return false;    
    }
}