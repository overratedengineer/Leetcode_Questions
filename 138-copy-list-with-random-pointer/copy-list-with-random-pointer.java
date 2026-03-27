class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        temp = head;
        while (temp!=null) {
            if (temp.random!=null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node dummy = new Node(0);
        Node temp2 = dummy;
        temp = head;
        while (temp != null) {
            Node copy = temp.next;
            temp2.next = copy;
            temp2 = copy;
            temp.next = copy.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}