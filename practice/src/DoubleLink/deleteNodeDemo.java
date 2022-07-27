package DoubleLink;

public class deleteNodeDemo {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head, pre = dummy;
        while(cur != null){
            if (cur.val == val)
                pre.next = cur.next;
            pre = cur;
            cur = cur.next;
        }

        return dummy.next;
    }
}
