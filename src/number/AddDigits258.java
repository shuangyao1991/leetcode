package number;

/**
 * Created by flyig on 2016/7/14.
 *
 * Question: Given a non-negative integer num, repeatedly add all its digitd until the result has only one digit.
 * Example: Given num=38, the process is like: 3 + 8 = 11, 1 + 1 = 2.Since 2 has only one digit, return it.
 */
public class AddDigits258 {

    public int addDigits(int num){
        if (num < 10){
            return num;
        }

        int result = num % 9;
        return  (result == 0) ? 9 : result;
    }
}
