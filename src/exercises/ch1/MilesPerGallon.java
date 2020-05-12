package exercises.ch1;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of miles:");
        double miles = input.nextDouble();
        System.out.println("The amount of gas:");
        double amount = input.nextDouble();
        System.out.println("Your miles-per-gallon is: " + miles / amount);

    }
}
