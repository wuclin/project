package Link;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class reversePrintDemo {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> d = new Stack<>();
        while(head != null)
        {
            d.push(head.val);
            head = head.next;
        }

        int[] res = new int[d.size()];
        for (int i = 0; i < d.size(); i++){
            res[i] = d.pop();
        }

        return res;
    }
}
