import java.util.List;

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        ListNode pre = head;
        for (int i=1; i<k; i++)
            cur = cur.next;
        while(cur != null){
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }
}
