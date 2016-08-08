package string;

/**
 * Created with by shuangyao on 2016/8/8.
 */

/**
 * Question: Given a roman numeral, convert it to an integer.
 * Note: Input is guaranteed to be within the range from 1 to 3999.
 * Roman Number:
 *  char  I  V  X  L   C   D   M
 *  num   1  5  10 50 100 500 1000
 */
public class RomanToIneteger13 {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        String template = "IVXLCDM";
        int[] nums = {1, 5, 10, 50, 100, 500, 1000};
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (i < chars.length - 1){
                if (template.indexOf(chars[i]) < template.indexOf(chars[i + 1])){
                    result = result - nums[template.indexOf(chars[i])];
                }else {
                    result = result + nums[template.indexOf(chars[i])];
                }
            } else {
                result = result + nums[template.indexOf(chars[i])];
            }
        }
        return result;
    }

    public static void main(String[] args){
        RomanToIneteger13 instance = new RomanToIneteger13();
        System.out.println(instance.romanToInt("MDCCCXCIX"));
        System.out.println((int)Math.sqrt(24));
    }
}
