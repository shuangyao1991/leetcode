package string;

/**
 * Created by flyig on 2016/7/14.
 */
public class ReverseString344 {

    public String reverseString(String s){
        if (s == null || s.length() == 0){
            return s;
        }

        char[] chars = s.toCharArray();
        int len = chars.length;
        char temp;
        for (int i = 0; i < len / 2; i++){
            temp = chars[i];
            chars[i] = chars[len - 1 - i];
            chars[len - 1 - i] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args){
        ReverseString344 instance = new ReverseString344();
        System.out.println(instance.reverseString("h.l"));
    }
}
