package string;

/**
 * Created by flyig.
 * Date: 2016/8/14.
 */

/**
 * Question: The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may
 *           want to display this pattern in a fixed font for better legibility).
 *           P   A   H   N
             A P L S I I G
             Y   I   R
             And then read line by line: "PAHNAPLSIIGYIR".
             Write the code that will take a string and make this conversion given a number of rows.
 */
public class ZigZagConversion6 {

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int len = 2 * numRows - 2;
        int times = s.length() / len;
        if (s.length() % len != 0){
            times++;
        }
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < times; j++){
                if (j * len + i < s.length())
                    sb.append(s.charAt(j * len + i));
                if (i != 0 && i != numRows - 1){
                    if (((j + 1) * len - i < s.length()))
                        sb.append(s.charAt((j + 1) * len - i));
                }
            }
        }
        return sb.toString();
    }

    public static  void main(String[] args){
        ZigZagConversion6 insatnce = new ZigZagConversion6();
        System.out.println(insatnce.convert("PAYPALISHIRING", 3));
    }
}
