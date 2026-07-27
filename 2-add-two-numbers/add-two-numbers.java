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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // add till any lsit become null take carry 
        //proceed carry to next store it as prev 
        //carry can be seem as n/10 and the sum unit digit will be n%10
        ListNode temp1=l1;
        ListNode temp2 =l2;
        ListNode fin = new ListNode(1);
        ListNode dummy = fin ;
        int carry =0;
        while(temp1!=null && temp2!=null){
            int v1 = temp1.val;
            int v2 = temp2.val;
            int sum = v1+v2+carry;
            int tokeep = sum%10;
              ListNode c = new ListNode(tokeep);
              dummy.next=c;
              dummy=dummy.next;
            carry = sum/10;
            temp1=temp1.next;
             temp2=temp2.next;
        }
        while(temp1!=null){
             int v1 = temp1.val;
            int sum = v1+carry;
            int tokeep = sum%10;
            ListNode c = new ListNode(tokeep);
            dummy.next=c;
            dummy=dummy.next;
            carry = sum/10;
              temp1=temp1.next;
            
        }
         while(temp2!=null){
             int v1 = temp2.val;
            int sum = v1+carry;
            int tokeep = sum%10;
            ListNode c = new ListNode(tokeep);
            dummy.next=c;
            dummy=dummy.next;
            carry = sum/10;
              temp2=temp2.next;
        }
        if(carry!=0){
            dummy.next= new ListNode(carry);
        }
        return fin.next;
    }
}