package tree;

/**
 * Created by flyig on 2016/7/20.
 */

/**
 * Given a binary tree, find its maximum depth.
 */
public class MaxDepOfBinaryTree104 {

    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args){
        MaxDepOfBinaryTree104 instance = new MaxDepOfBinaryTree104();
        TreeNode root = new TreeNode(1);
        String[] nums = {"2", "*", "4", "*", "*", "*"};
        root.produceFromArry(nums);
        System.out.println(instance.maxDepth(root));
    }
}
