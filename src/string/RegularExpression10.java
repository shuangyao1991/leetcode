package string;

/**
 * Created with by shuangyao on 2016/8/29.
 */

/**
 * Question: Implement regular expression matching with support for '.' and '*'.
 * Example:
 *          isMatch("aa","a") → false
            isMatch("aa","aa") → true
            isMatch("aaa","aa") → false
            isMatch("aa", "a*") → true
            isMatch("aa", ".*") → true
            isMatch("ab", ".*") → true
            isMatch("aab", "c*a*b") → true
 */
public class RegularExpression10 {

    public boolean isMatch(String s, String p) {
        if ((s == null && p == null) || (s.length() == 0 && p.length() == 0)) return true;
        if (p == null || p.length() == 0 || s == null || s.length() == 0){
            return false;
        }

        int i = 0, j = 0;
        while (j < p.length() && i < s.length()){
            if (j < p.length() - 1 && p.charAt(j + 1) == '*'){
                if (j + 2 >= p.length()){
                    if (p.charAt(j) == '.'){
                        return true;
                    }else if (p.charAt(j) == s.charAt(i)){
                        while (i < s.length() - 1){
                            if (s.charAt(i) != s.charAt(i+1)){
                                return false;
                            }
                        }
                        return true;
                    }else {
                        return false;
                    }
                }
                if (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j)){
                    while (i < s.length() &&
                            (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')){
                        if (isMatch(s.substring(i + 1), p.substring(j + 2)))
                            return true;
                        i++;
                    }
                }else {
                    j = j + 2;
                }
            }else {
                if (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j)){
                    i++;
                    j++;
                }else
                    return false;
            }
        }

        return i == s.length();
    }

    public static void main(String[] agrs){
        RegularExpression10 instance = new RegularExpression10();
        System.out.println(instance.isMatch("ab", ".*c"));
//        System.out.println("a".substring(3));
    }
}
