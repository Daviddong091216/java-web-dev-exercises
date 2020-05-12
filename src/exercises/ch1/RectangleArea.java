package exercises.ch1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle's length:");
        double length = input.nextDouble();
        System.out.println("Please enter rectangle's width:");
        double width = input.nextDouble();
        System.out.println("The rectangle' area is: " + length * width);
    }
}
