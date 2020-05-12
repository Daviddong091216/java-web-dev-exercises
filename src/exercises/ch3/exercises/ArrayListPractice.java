package exercises.ch3.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            list.add(i);
        }
//        System.out.println(list);

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("Ethan");
        strArray.add("Miley");
        strArray.add("Aaron");

        String str = "I love you, Miley!";

        sumArray(list);
        printArray(strArray);
//        printWordOfString(str);
    }
    private static void sumArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size() ; i++) {
            if (array.get(i) % 2 == 0) {
                sum += array.get(i);
            }
        }
        System.out.println(sum);
    }


    public static void printArray(ArrayList<String> array) {
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
        }
    }

    /*public static void printWordOfString(String str) {
        String[] strArray = str.split(" ");
        ArrayList<String> list =new ArrayList<>();
        list = Arrays.asList(strArray)
        for (int i = 0; i < strArray.length ; i++) {
            System.out.println(strArray[i]);
        }
    }*/

}
