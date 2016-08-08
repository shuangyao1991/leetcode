package number;

/**
 * Created with by shuangyao on 2016/8/8.
 */

import java.util.Map;

/**
 * Question: Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo231 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        String s = Integer.toBinaryString(n);
        if (s.startsWith("1") && s.substring(1).indexOf("1") == -1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        PowerOfTwo231 instance = new PowerOfTwo231();
        System.out.println(instance.isPowerOfTwo(12));
    }
}

