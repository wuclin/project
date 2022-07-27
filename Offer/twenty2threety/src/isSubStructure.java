//树的一般是要通过遍历




public class isSubStructure {
    //这个表示找到b再a的什么地方
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) &&
                (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }
    //
    public boolean recur(TreeNode A, TreeNode B){
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }
}
