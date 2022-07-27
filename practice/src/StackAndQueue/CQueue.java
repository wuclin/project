package StackAndQueue;

import java.util.Stack;

class CQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
       if (outStack.isEmpty())
       {
           if (inStack.isEmpty())
               return -1;
           while (!inStack.isEmpty())
               outStack.add(inStack.pop());
       }
       return outStack.pop();

    }
}