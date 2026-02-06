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
        ListNode temp = l1;
        ListNode temp2 =l2;
        int carry =0;
        while(temp!=null && temp2!=null){
            int val1 = temp.val;
            int val2 = temp2.val;
            int fv = val1+val2+carry;
            if(fv>9){
                carry=1;
                fv%=10;
            } else {
                carry=0;
            }
            temp.val=fv;
            temp2.val=fv;
            temp=temp.next;
            temp2=temp2.next;
        }
       ListNode head= null;
        if(temp==null){
            head=l2;
        } else {
            head=l1;
        }
        while(temp!=null){
            int val1 = temp.val;
            int fv = val1+carry;
             if(fv>9){
                carry=1;
                fv%=10;
            } else {
                carry=0;
            }
            temp.val=fv;
            temp=temp.next;
        }
        while(temp2!=null){
            int val1 = temp2.val;
            int fv = val1+carry;
             if(fv>9){
                carry=1;
                fv%=10;
            } else {
                carry=0;
            }
            temp2.val=fv;
            temp2=temp2.next;
        }
        if(carry!=0){
            ListNode t = head;
            while(t.next!=null){
                t=t.next;
            }
            ListNode n = new ListNode(carry);
            t.next=n;
            n.next=null;
        }
       return head;
    }
}