package number;

/**
 * Created by flyig.
 * Date: 2016/8/10.
 */

/**
 * Question: Write a function that takes an unsigned integer and returns the number of ’1' bits it has
 * Example:  integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class NumberOf1Bits191 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        s = s.replace("0", "");
        return s.length();
    }

    public static void main(String[] args){
        NumberOf1Bits191 instance = new NumberOf1Bits191();
        System.out.println(instance.hammingWeight(11));
    }
}
