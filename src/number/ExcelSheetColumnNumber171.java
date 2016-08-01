package number;

/**
 * Created with by shuangyao on 2016/8/1.
 */

/**
 * Question: Given a column title as appear in an Excel sheet, return its corresponding column number.
 * Example: A -> 1, B -> 2, ..., Z -> 26, AA -> 27,...
 */
public class ExcelSheetColumnNumber171 {

    public int titleToNumber(String s) {
        int result = 0;
        for (char c : s.toCharArray()){
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args){
        ExcelSheetColumnNumber171 instance = new ExcelSheetColumnNumber171();
        System.out.println(instance.titleToNumber("AA"));
    }
}
