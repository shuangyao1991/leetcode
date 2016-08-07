package tree;

/**
 * Created with by shuangyao on 2016/8/1.
 */

/**
 * Question: Given two binary trees, write a function to check if they are equal or not.
 */
public class SameTree100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }

        if (p != null && q != null){
            if (p.val == q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
}
