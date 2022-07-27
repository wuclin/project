import java.util.LinkedList;

public class ninth {
    public static void main(String[] args){
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(3);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

    }
}
class CQueue{
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    CQueue(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    void appendTail(int x){
        stack1.add(x);
    }
    int deleteHead(){

        while (!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        if (stack2.isEmpty())
            return -1;
        return stack2.pop();
    }



}