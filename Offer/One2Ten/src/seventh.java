import java.util.HashMap;
import java.util.Map;

public class seventh {
    public static void main(String[] args){

    }


}
class Solution7{
    Map<Integer, Integer> InOrderMap;

    public TreeNode buildTree(int[] preorder, int[] inorder){
        int n  = preorder.length;
        InOrderMap = new HashMap<Integer, Integer>();
        for (int i=0;i<n;i++){
            InOrderMap.put(inorder[i],i);
            //这里要以节点的值为key，因为是通过前序的节点来定位该点在中序的下标
        }

        return build(preorder,inorder,0,n-1,0,n-1);
        //这里的左右是指传进去序列的左右边界
    }
    public TreeNode build(int[] preorder,int[] inorder,int preleft,int preright,int inleft,int inright){
        if (preleft > preright)
            return null;
        int preorderRoot = preleft;                                 //前序左边界就是根的位子
        int inorderRoot = InOrderMap.get(preorder[preorderRoot]);   //中序通过hash表可以找到根的位子

        //等待中序中根的位置后就可以计算出左子树的节点数目
        int InOrderLeftNum = inorderRoot - inleft;
        //以先序排序中的根位置建立树
        TreeNode root = new TreeNode(preorder[preorderRoot]);

        //开始递归构建左右子树，并连接到root上
        root.left = build(preorder,inorder,preleft+1,preleft+InOrderLeftNum,inleft,inorderRoot-1);
        root.right = build(preorder,inorder,preleft+InOrderLeftNum+1,preright,inorderRoot+1,inright);



        return root;
    }
}
