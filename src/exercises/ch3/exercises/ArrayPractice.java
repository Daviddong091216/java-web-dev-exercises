package exercises.ch3.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numArray.length ; i++) {
            if (numArray[i] % 2 !=0) {
                System.out.println(numArray[i]);
            }
        }

        String str = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse. ";
        String[] strArray = str.split("\\.");
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }

        System.out.println(Arrays.toString(strArray));



    }
}
