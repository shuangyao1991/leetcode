package string;

/**
 * Created with by shuangyao on 2016/8/1.
 */

/**
 * Question: Given two strings s and t, write a function to determine if t is an anagram of s.
 * Example: s = "anagram", t = "nagaram", return true.
 *          s = "rat", t = "car", return false.
 * Note: You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }

        int[] flags = new int[26];
        for (int i = 0; i < s.length(); i++){
            flags[s.charAt(i) - 'a']++;
            flags[t.charAt(i) - 'a']--;
        }

        for (int i : flags){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidAnagram242 instance = new ValidAnagram242();
        System.out.println(instance.isAnagram("asd", "dat"));
    }
}
