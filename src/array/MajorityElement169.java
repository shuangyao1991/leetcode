package array;

/**
 * Created by flyig.
 * Date: 2016/8/7.
 */

/**
 *  Question: Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *  Note: You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        int count = 1;
        int flag = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                count++;
                flag = nums[i];
            } else if (flag == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        MajorityElement169 instance = new MajorityElement169();
        int[] nums = {6, 7, 7};
        System.out.println(instance.majorityElement(nums));
    }
}
