package exercises.ch1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter your love: ");
        String love = keyboardInput.nextLine();
        System.out.println("I love {love}");

        String str = "Miley";
        System.out.println(str.length());
        char[] str1 = str.toCharArray();
        str1[0] = 'K';
        System.out.println(str1[0]);
        String[] children = {"Ethan", "MIley", "Aaron"};

        System.out.println(children[0]);
        ArrayList<String> children1 = new ArrayList<>();
        children1.add("Ethan");
        children1.add("Miley");

//        {"Ethan", "MIley", "Aaron"};

        System.out.println(children1);

        HashMap<String, Double> students = new HashMap<>();
        students.put("Ethan", 100.00);
        students.put("Miley", 100.00);
        students.put("Aaron", 100.00);
        System.out.println(students.get("Miley"));
        System.out.println(students.size());


        /*for (Map.Entry<String, Double> s : students.entrySet()) {
            System.out.println(s.getKey());
        }*/

    }
}
