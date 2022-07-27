package DoubleLink;


public class getIntersectionNodeDemo {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode temA = headA, temB = headB;
        while(temA != temB){
            temA = temA == null ? temB : temA.next;
            temB = temB == null ? temA : temB.next;
        }

        return temB;
    }

}
