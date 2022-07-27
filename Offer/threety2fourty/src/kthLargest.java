public class kthLargest {
    int res, k;
    int kthLargest(TreeNode root, int k){
        this.k = k;
        recur(root);
        return res;
    }
    void recur(TreeNode cur){
        if (cur == null) return;
        recur(cur.right);
        if (k == 0) return;
        if (--k == 0) res = cur.val;
        recur(cur.left);
    }
}
