package string;

/**
 * Created by flyig.
 * Date: 2016/8/14.
 */

/**
 * Question: Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S
 *            is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring5 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1){
            return s;
        }

        String result = "";
        int temp;
        for (int i = 0; i < s.length() - 1; i++){
            temp = findOdd(s, i);
            if (2 * temp + 1 > result.length()){
                result = s.substring(i - temp, i + temp + 1);
            }
            if (s.charAt(i) == s.charAt(i + 1)){
                temp = findEven(s, i);
                if (2 * temp + 2 > result.length()){
                    result = s.substring(i - temp, i + 2 + temp);
                }
            }
        }
        return result;

    }

    public int findOdd(String s, int index){
        int count = 0;
        while (s.charAt(index - count) == s.charAt(index + count)){
            count++;
            if (index + count > s.length() - 1 || index - count < 0){
                break;
            }
        }
        count--;
        return count;
    }

    public int findEven(String s, int index){
        int count = 0;
        while (s.charAt(index - count) == s.charAt(index + count + 1)){
            count++;
            if (index - count < 0 || index + count + 1 >s.length() - 1){
                break;
            }
        }
        count--;
        return count;
    }

    public static void main(String[] args){
        LongestPalindromicSubstring5 instance =
                new LongestPalindromicSubstring5();
        System.out.println(instance.longestPalindrome("abcddefghthg"));
    }
}
