package exercises.ch2;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        students.put("Ethan", 99.0);
        students.put("Miley", 98.0);
        students.put("Aaron", 97.0);
        students.put("Aaron", 100.0);
//        students.put("Aaronn", 100.0);

        System.out.println(students.entrySet());

        students.remove("Aaron");
        System.out.println(students.entrySet());

        students.put("Aaron", 100.0);

        System.out.println(students.get("Ethan"));
        System.out.println(students.get(100));

        System.out.println(students.keySet());
        System.out.println(students.values());

        System.out.println(students.containsKey("Aaron"));
        System.out.println(students.containsValue(100.0));

        System.out.println(students.size());
        System.out.println(students.keySet().size());
        System.out.println(students.values().toString());

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + student.getValue());
        }

//        for (String student : students.keySet()) {
//            System.out.println(student);
//        }
//
//        for (Double grade : students.values()) {
//            System.out.println(grade);
//        }
//        for (String student : students.keySet()) {
//            System.out.println(students.get(student));
//        }


    }


}
