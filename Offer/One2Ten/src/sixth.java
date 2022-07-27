import java.util.Arrays;
import java.util.Stack;

public class sixth {
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        a.next = b;
        b.next = c;
        int[] array = reversePrint(a);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] reversePrint(ListNode head){
        int length   = 0;
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
            length++;
        }
        int[] a = new int[length];
        int s = 0;
        while (!stack.isEmpty()){
            a[s++] = stack.pop();
        }

        return a;

    }
}

