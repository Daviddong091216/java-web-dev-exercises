package exercises.ch2;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Iloveyou,Miley!";
        System.out.println(str);
//        char[] strChar = str.toCharArray();
//        String[] strString = str.split("");
//        System.out.println(strChar);
//        System.out.println(strString);
//
//        for (char cha : strChar) {
//            System.out.println(cha);
//        }
//
//        for (String cha : strString) {
//            System.out.println(cha);
//        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length() ; i++) {
            if (i % 2 == 0) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
