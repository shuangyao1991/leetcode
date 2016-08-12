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
        return n > 0 && (Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3)))) % n == 0;
    }

    public static void main(String[] args){
        PowerOdThree326 instance = new PowerOdThree326();
        System.out.println(instance.isPowerOfThree(80));
    }
}
