package exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class exam1 {

    /**
     *        3
     *    /      \
     *   9       10
     *  /  \     /  \
     *  11 12    33 23
     */
    private static Tree root;


    public static void main(String[] args) {
        /**
         * 输出
         * [3]
         * [9, 10]
         * [11, 12, 33, 23]
         */
        levelOrder(root).forEach(System.out::println);
    }
    // 实现这个函数
    public static List<List<Integer>> levelOrder(Tree tree) {
        List<List<Integer>> res = new ArrayList<>();
        if (tree == null)
            return null;
        Queue<Tree> q = new LinkedList<>();
        q.add(tree);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++){
                Tree t = q.poll();
                list.add(t.val);
                if (t.childs != null) {
                    for (Tree tree1 : t.childs)
                        q.offer(tree1);
                }
            }

            res.add(list);
        }
        return res;

    }

    static class Tree{
        public int val;
        public List<Tree> childs;
        public Tree(int val) {
            this.val = val;
        }
        public Tree() {
        }
    }

    // 这个方法可以忽略，直接实现上面代码即可
    static {
        Tree tree = new Tree(9);
        Tree tree1 = new Tree(10);
        List<Tree> childs = new ArrayList<>();
        childs.add(tree);
        childs.add(tree1);
        root = new Tree(3);
        root.childs = childs;
        Tree tree2 = new Tree(11);
        Tree tree3 = new Tree(12);
        ArrayList<Tree> childs1 = new ArrayList<>();
        childs1.add(tree2);
        childs1.add(tree3);
        tree.childs = childs1;
        Tree tree4 = new Tree(33);
        Tree tree5 = new Tree(23);
        ArrayList<Tree> childs2 = new ArrayList<>();
        childs2.add(tree4);
        childs2.add(tree5);
        tree1.childs = childs2;
    }




}