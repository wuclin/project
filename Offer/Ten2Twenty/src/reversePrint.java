import java.util.Stack;

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.add(head.val);
            head = head.next;
        }
        int[] a = new int[stack.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }
        return a;
    }
}


