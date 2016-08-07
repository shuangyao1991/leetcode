package array;

/**
 * Created by flyig.
 * Date: 2016/7/20.
 */

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 *      1. You must do this in-place without making a copy of the array.
 *      2. Minimize the total number of operations.
 */
public class MoveZeroes283 {

    public void moveZeroes(int[] nums){
        if (nums == null || nums.length <= 1) return;

        int first0 = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                first0 = i;
                break;
            }
        }
        if (first0 == -1 || first0 == nums.length - 1) return;

        for (int i = first0 + 1; i < nums.length; i++){
            if (nums[i] != 0){
                nums[first0] = nums[i];
                nums[i] = 0;
                first0++;
            }
        }
    }

    public static void main(String[] args){
        MoveZeroes283 instance = new MoveZeroes283();
        int[] nums = {0, 1, 3, 0, 12};
        instance.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
