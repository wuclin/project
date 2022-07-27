package Link;

public class reverseBetweenDemo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        for (int i = 1; i <= left-1; i++)
            pre = pre.next;


        ListNode r = pre;
        for (int i = 1; i <= right - left+1; i++)
            r = r.next;

        ListNode l = pre.next;
        ListNode tail = r.next;


        pre.next = null;
        r.next = null;

        reverseMethod(l);

        pre.next = r;
        l.next = tail;

        return dummy.next;
    }

    public void reverseMethod(ListNode l){
        ListNode pre = null;
        ListNode cur = l;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
}
