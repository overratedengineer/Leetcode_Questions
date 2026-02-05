public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode a = headA, b = headB;
        while (a != null) {
            lenA++;
            a = a.next;
        }
        while (b != null) {
            lenB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff-->0) a = a.next;
        } else {
            int diff = lenB - lenA;
            while (diff-->0) b = b.next;
        }

        while (a != null && b != null) {
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
}
