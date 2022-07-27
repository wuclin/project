public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head ,q = head;
        if (head.val == val)
            return head.next;
        else q = head.next;

        while (q != null && q.val != val){
           p = q;
           q = q.next;
        }
        if (q != null)
            p.next = q.next;

        return head;
    }
}
