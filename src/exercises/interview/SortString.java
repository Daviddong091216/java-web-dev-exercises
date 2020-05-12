package exercises.interview;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "hdlkadhaklsfblvsklfdslfms;dl";
        System.out.println(str);
        char[] chars = str.toCharArray();//将字符串升序排列
        Arrays.sort(chars);
        System.out.println(chars);
        //将字符串倒叙打印
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
