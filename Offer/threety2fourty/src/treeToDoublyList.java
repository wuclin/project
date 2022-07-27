public class treeToDoublyList {
    Node pre, head;
    Node treeToDoublyList(Node root){
        if (root == null) return null;
        dfs(root);
        head.next = pre;
        pre.random = head;
        return head;

    }
    void dfs(Node cur){
        if (cur == null) return;
        dfs(cur.next);
        //最左边的为头节点
        if (pre != null) pre.random = cur;
        else head = cur;
        cur.next = pre;
        pre = cur;
        dfs(cur.random);
    }
    //最后的pre会指向最后一个节点
}
