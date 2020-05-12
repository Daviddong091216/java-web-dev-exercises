package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RunCountingCharacters {

    public static void main(String[] args) {
        String testString = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there. with me";

        String str = "apple";
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please input string:");
        String inputString = input.nextLine();*/

        CountingWords.getCountingWords(testString);
        CountingCharacters.getCountingCharacters(testString);

        File text = new File("C:\\Users\\16366\\Desktop\\aaa.txt");
        Path path = Paths.get(text.getPath());

//        OutputStream os = null;
//        os = new FileOutputStream(text, true);
//        os.write("\n".getBytes());
//        os.write(add.getBytes());
//        os.close();

    }
}
