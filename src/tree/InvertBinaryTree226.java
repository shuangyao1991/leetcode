package tree;

/**
 * Created by flyig.
 * Date: 2016/7/20.
 */

/**
 * Invert a binary tree.
 */
public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root){
        if (root == null) return root;

        TreeNode treeNode = root.left;
        root.left = root.right;
        root.right = treeNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args){
        InvertBinaryTree226 instance = new InvertBinaryTree226();

        TreeNode root = new TreeNode(1);
        String[] nums = {"2", "3", "4", "*", "6", "*"};
        root.produceFromArry(nums);
        instance.invertTree(root);
        System.out.println();
    }
}
