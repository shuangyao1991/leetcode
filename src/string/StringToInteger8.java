package string;

/**
 * Created with by shuangyao on 2016/8/29.
 */

import java.util.StringTokenizer;

/**
 * Question: Implement atoi to convert a string to an integer.
 * Note: If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
public class StringToInteger8 {

    public int myAtoi(String str) {
        if (str == null || str.matches("[\\s]*")){
            return 0;
        }

        str = str.trim();
        int start = 0, end = 0, flag = 0;
        char ch;
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if ("+-".indexOf(ch) != -1){
                if (flag != 0)
                    break;
                else if (ch == '+')
                    flag = 1;
                else
                    flag = -1;
            }else if ("1234567980".indexOf(ch) != -1){
                if (start == end){
                    start = i;
                    end = i + 1;
                } else
                    end++;
            }else {
                break;
            }
        }

        if (start == end){
            return 0;
        }
        if (start != 0 && str.charAt(start - 1) == '-'){
            flag = -1;
        }
        if (flag == 0)
            flag = 1;
        try {
            return flag * Integer.valueOf(str.substring(start, end));
        }catch (NumberFormatException e){
            if (flag < 0)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args){
        StringToInteger8 instance = new StringToInteger8();
        System.out.println(instance.myAtoi(" b11228552307"));
    }
}
