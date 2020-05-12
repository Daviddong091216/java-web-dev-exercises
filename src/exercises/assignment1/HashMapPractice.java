package exercises.assignment1;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, String> columnChoices = new HashMap<>();

        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");

        System.out.println(columnChoices);
        System.out.println(columnChoices.keySet());
        System.out.println(columnChoices.values());
        System.out.println(columnChoices.get("all"));
        System.out.println(columnChoices.size());
        System.out.println(columnChoices.containsKey("all"));
        System.out.println(columnChoices.containsValue("All"));
//        System.out.println(columnChoices.getKey());

        for (Map.Entry<String, String> item : columnChoices.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }

        for (String item : columnChoices.keySet()) {
            System.out.println(item);
        }

        for (String item : columnChoices.values()) {
            System.out.println(item);
        }

//        for (String item : columnChoices.keySet()) {
//            System.out.println(item.get(item));
//        }
//        for (Map.Entry<String, String> item : columnChoices.entrySet()) {
//            System.out.println(item.get(item.getKey()));
//        }
        for (String item : columnChoices.keySet()) {
            System.out.println(columnChoices.get(item));
        }


    }
}
