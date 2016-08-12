package array;

/**
 * Created with by shuangyao on 2016/8/12.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Question: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *           You may assume that each input would have exactly one solution.
 * Example:
 *          Given nums = [2, 7, 11, 15], target = 9,
 *          Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args){
        TwoSum1 instance = new TwoSum1();
        int[] nums = {2, 3, 4, 9, 11};
        System.out.println(Arrays.toString(instance.twoSum(nums, 14)));
    }
}
