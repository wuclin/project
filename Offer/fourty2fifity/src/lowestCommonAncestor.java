public class lowestCommonAncestor {
    //这个是二叉搜索树
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
