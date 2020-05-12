package exercises.ch5;

import java.util.Scanner;

public class TempretureTestDrive {
    public static void main(String[] args) {
        double celsius;
        Scanner input;
        Temperature tem = new Temperature();



        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        tem.setFahrenheit(input.nextInt());
        input.close();

        celsius = (tem.getFahrenheit() - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");

        System.out.println(Temperature.ABSOLUTE_ZERO_FAHRENHEIT1);
        System.out.println(tem.ABSOLUTE_ZERO_FAHRENHEIT1);
//        System.out.println(tem.absoluteZeroFahrenheit);

    }
}
