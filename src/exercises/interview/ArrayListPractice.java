package exercises.interview;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = selectArray(10);
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));//loop arraylist
        }

    }

    public static ArrayList<Integer> selectArray(int num) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int countNum = 0;
        while (countNum < num) {//check number of items
            int randomNum = new Random().nextInt(101);
            if (!arr.contains(randomNum)) {//check duplicate
                arr.add(randomNum);
                countNum++;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {//select oven number
                tempArray.add(arr.get(i));
            }
        }
        return tempArray;
    }
}
