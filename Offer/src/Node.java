public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        next = _left;
        random = _right;
    }
}
