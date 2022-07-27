package DoubleLink;

public class mergeTwoListsDemo {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2;
        ListNode p = new ListNode(-1);
        ListNode t = p;
        while(t1 != null || t2 != null){
            if (t1.val <= t2.val)
            {
                p.next = new ListNode(l1.val);
                t1 = t1.next;
            }else{
                p.next = new ListNode(l2.val);
                t2 = t2.next;
            }
            p = p.next;
        }
        p.next = t1 == null ? t2 : t1;

        return t.next;
    }
}
