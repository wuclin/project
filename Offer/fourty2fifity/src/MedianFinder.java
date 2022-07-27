import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> A,B;
    //使用堆，堆就是优先队列，思路是把大堆里面小的加入到小堆中
    //小堆中大的加入到大堆中，保证了两个堆一个存小的一个存大的
    //小顶堆存大的，大顶堆存小的
    public MedianFinder() {
        A = new PriorityQueue<>(); //小顶堆
        B = new PriorityQueue<>((x, y) -> (y - x));//大顶堆
    }

    public void addNum(int num) {
        if (A.size() != B.size()){
            A.add(num);
            B.add(A.poll());
        }else
        {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return (A.size() == B.size()) ? (A.peek()+B.peek())/2.0 : A.peek();
    }


}
