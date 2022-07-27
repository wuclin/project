package DoubleLink;

public class getKthFromEndDemo {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 1; i <= k; i++)
            fast = fast.next;

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
