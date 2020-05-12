package exercises.ch2;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>('a');

//        chars.add('a');
//        chars.add('d');
//        chars.add(2, '2');
//        chars.add(1, '1');


        for (char i : chars) {
            System.out.println(i);
        }
//        System.out.println(chars.get(2));


    }
}
