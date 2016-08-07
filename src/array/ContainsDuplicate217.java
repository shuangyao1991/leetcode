package array;

/**
 * Created by flyig.
 * Date: 2016/8/7.
 */

import java.util.HashSet;
import java.util.Set;

/**
 *  Question: Given an array of integers, find if the array contains any duplicates. Your function should return true
 *  if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums){
            if (set.contains(num)){
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
