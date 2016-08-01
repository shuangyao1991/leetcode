package array;

/**
 * Created with by shuangyao on 2016/7/29.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
 *      1. Each element in the result must be unique.
 *      2. The result can be in any order.
 */
public class IntersectionOfTwoArray349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null){
            return null;
        }

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersection = new HashSet<Integer>();
        for (int num : nums1){
            set.add(num);
        }
        for (int num : nums2){
            if (set.contains(num)){
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection){
            result[index++] = num;
        }
        return result;
    }
}
