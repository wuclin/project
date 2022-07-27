public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.right) - depth(root.left)) <=1 && isBalanced(root.right) && isBalanced(root.left);
    }
    int depth(TreeNode root){
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }


}
class isBalanced2{
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    int recur(TreeNode root){
        if (root == null) return 0;
        int left = recur(root.left);
        if (left == -1) return -1;
        int right = recur(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
