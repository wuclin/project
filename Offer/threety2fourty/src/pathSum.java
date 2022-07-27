import java.util.LinkedList;
import java.util.List;

/***
 * 这个路径要求的是从根到叶子节点的
 */
public class pathSum {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    List<List<Integer>> pathSum(TreeNode root, int sum){
        recur(root, sum);
        return res;
    }

    void recur(TreeNode root, int tar){
        if (root == null) return;
        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList(path));
        //记录路径时若直接执行 res.append(path) ，则是将 path 对象加入了 res ；后续 path 改变时， res 中的 path 对象也会随之改变。
        //正确做法：res.append(list(path)) ，相当于复制了一个 path 并加入到 res 。

        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();

    }
}
