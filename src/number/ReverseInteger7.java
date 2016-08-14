package number;

/**
 * Created by flyig.
 * Date: 2016/8/14.
 */

/**
 * Question: Reverse digits of an integer.
 * Example: x = 123, return 321. x = -123, return -321.
 */
public class ReverseInteger7 {

    public int reverse(int x) {
        int result = 0;
        int flag = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        while (x > 0){
            if (result > Integer.MAX_VALUE / 10) return 0;
            result = result * 10 + (x % 10);
            x = x / 10;
        }
        return flag * result;
    }

    public static void main(String[] args){
        ReverseInteger7 instance = new ReverseInteger7();
        System.out.println(instance.reverse(-2147483412));
    }
}
