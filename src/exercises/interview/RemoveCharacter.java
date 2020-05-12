package exercises.interview;

import java.sql.Array;
import java.util.ArrayList;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "LaunchCodeA";
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        char[] strToArray = str.toCharArray();
        ArrayList<Character> strToNewArray1 = new ArrayList<>();
        ArrayList<Character> strToNewArray2 = new ArrayList<>();

//        for (int i = 0; i < str.length(); i ++) {
//            if (strToArray[i] != 'a' && strToArray[i] != 'e'
//                    && strToArray[i] != 'i' && strToArray[i] != 'o'
//                    && strToArray[i] != 'u' ) {
//                strToNewArray1.add(strToArray[i]);
//            }
//        }
        /*for (char cha : str.toCharArray()) {
            if (cha != 'a' && cha != 'e' && cha != 'i'
                    && cha != 'o' && cha != 'u' ) {
                strToNewArray1.add(cha);
            }
        }*/
        for (char cha : str.toCharArray()) {
            if (!vowels.contains(cha) ) {
                strToNewArray1.add(cha);
            }
        }
        System.out.println(strToNewArray1);
        str = strToNewArray1.toString();
        System.out.println(str.trim());

        for (int i = 0; i < str.length(); i ++) {
            if (i % 2 != 0) {
                strToNewArray2.add(str.toCharArray()[i]);
            }
        }

        str = strToNewArray2.toString();
        System.out.println(str);



    }
}
