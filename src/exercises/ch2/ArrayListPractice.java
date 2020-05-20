package exercises.ch2;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>('a');
        chars.add('a');
        chars.add('d');
//        chars.add(2, '2');
//        chars.add(1, '1');


//        for (char i : chars) {
//            System.out.println(i);
//        }
//        System.out.println(chars.get(2));

        ArrayList<Student> stu = new ArrayList<>();
        Student one = new Student("Miley",8);
        Student two = new Student("Aaron",3);
        Student three = new Student("Ethan",12);
        stu.add(one);
        stu.add(two);
        stu.set(0,three);
        System.out.println(stu.indexOf("one"));
        System.out.println(stu.indexOf("three"));
        System.out.println(stu.indexOf(three));



    }
}
