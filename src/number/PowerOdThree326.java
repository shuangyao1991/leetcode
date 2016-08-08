package number;

/**
 * Created with by shuangyao on 2016/8/8.
 */

/**
 * Question: Given an integer, write a function to determine if it is a power of three.
 * Follow up: Could you do it without using any loop / recursion?
 */
public class PowerOdThree326 {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 3) return true;
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum % 9 == 0;
    }

    public static void main(String[] args){
        PowerOdThree326 instance = new PowerOdThree326();
        System.out.println(instance.isPowerOfThree(27));
    }
}
