package array;

/**
 * Created by flyig.
 * Date: 2016/8/14.
 */

/**
 * Question:　Given a string, find the length of the longest substring without repeating characters.
 * Example:
 *          Given "abcabcbb", the answer is "abc", which the length is 3.
 *          Given "bbbbb", the answer is "b", with the length of 1.
 *          Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        if (s ==null || s.length() == 0){
            return 0;
        }

        int start = 0, end = 1;
        int count = 1;
        String str;
        while(end < s.length()){
            str = s.substring(start, end);
            if (str.indexOf(s.charAt(end)) == -1){
                end++;
            } else {
                start = start + str.indexOf(s.charAt(end)) + 1;
            }
            count = (count < end - start) ? (end - start) : count;
            if (end <= start && end < s.length() - 1){
                end++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        LongestSubstring3 instance = new LongestSubstring3();
        System.out.println(instance.lengthOfLongestSubstring("p"));
    }
}
