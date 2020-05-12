package exercises.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class CountInputCharacters2 {
    public static void main(String[] args) {
        System.out.println("Please enter a string :");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
//        String str = "I love you, Miley 8 !!!";
        inputCount(str);
    }

    public static void inputCount(String str) {
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char cha = charArray[i];
            if ('A' <= cha && cha <= 'Z') {
                countUpper++;
            } else if ('a' <= cha && cha <= 'z') {
                countLower++;
            } else if ('0' <= cha && cha <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("The number of upper characters is : " + countUpper);
        System.out.println("The number of lower characters is : " + countLower);
        System.out.println("The number of number is : " + countNumber);
        System.out.println("The number of other is : " + countOther);
    }
}
