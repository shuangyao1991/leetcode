package number;

/**
 * Created with by shuangyao on 2016/8/29.
 */

/**
 * Question: Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber9 {

    public boolean isPalindrome(int x){
        if (x < 0)
            return false;

        int e = (int)Math.log10(x);
        while (e > 0){
            if (x % 10 != x / (int)Math.pow(10, e)){
                return false;
            }
            x = x % (int)Math.pow(10, e);
            x = x / 10;
            e -= 2;
        }
        return true;
    }

    public static void main(String[] args){
        PalindromeNumber9 instance = new PalindromeNumber9();
        System.out.println(instance.isPalindrome(1000021));
    }
}
