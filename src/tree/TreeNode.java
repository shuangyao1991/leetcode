package tree;

/**
 * Created by flyig on 2016/7/20.
 */

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x){
        this.val = x;
    }

    public void produceFromArry(String[] nums){
        if (nums == null || nums.length == 0){
            return;
        }

        if (!nums[0].equals("*")){
            this.left = new TreeNode(Integer.valueOf(nums[0]));
        }
        if (!nums[1].equals("*")){
            this.right = new TreeNode(Integer.valueOf(nums[1]));
        }
        if (nums.length == 2){
            return;
        }

        int len = nums.length;
        if (this.left != null){
            this.left.produceFromArry(Arrays.copyOfRange(nums, 2, (len - 2) / 2 + 2));
        }
        if (this.right != null){
            this.right.produceFromArry(Arrays.copyOfRange(nums, (len - 2) / 2 + 2, len));
        }
    }
}
