import java.util.LinkedList;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack1; //一个用来正常实现栈功能，一个用来输出最小值
    Stack<Integer> stack2;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void push(int x) {
        stack1.add(x);
        if (stack2.isEmpty() || stack2.peek() > x)
            stack2.add(x);

    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek()))
            stack2.pop();//如果2的值和1一样，则2也要出栈保持一致
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        if (stack2.isEmpty())
            return 0;
        return stack2.peek();

    }
}
