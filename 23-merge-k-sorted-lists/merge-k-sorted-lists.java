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
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);
      for(ListNode ln : lists){
        if(ln!=null){
        pq.add(ln);
        }
      }
       ListNode dummy = new ListNode(-1);
       ListNode temp = dummy;

       while(!pq.isEmpty()){
       ListNode curr = pq.poll();
       temp.next = curr;
       curr=curr.next;
       temp=temp.next;
       if(curr!=null){
       pq.add(curr);
       }
       }
       dummy=dummy.next;
       return dummy;


    }
}