package exercises.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListHashMapPractice {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> jobs = new ArrayList<>();

        HashMap<String, String> columnChoices = new HashMap<>();
        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");

        jobs.add(columnChoices);
        System.out.println(jobs);

//        for (HashMap<String, String> item: jobs) {
//            System.out.println(item);
//            for (Map.Entry<String, String> element : item.entrySet()) {
//                System.out.println(element);
//                System.out.println(element.getKey());
//                System.out.println(element.getValue());
//            }
//
//        }

        for (HashMap<String, String> row : jobs) {
            for (String item : row.keySet()) {
                System.out.println(item);
                System.out.println(row.get(item));
            }
        }


    }
}
