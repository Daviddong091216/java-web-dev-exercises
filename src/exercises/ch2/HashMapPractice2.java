package exercises.ch2;

import java.util.*;

public class HashMapPractice2 {
    public static void main(String[] args) {
        String str = "I love you, Miley!";
        HashMap<Character, Integer> counts = new HashMap<>();
        int numOfChar = 1;
        for (char cha : str.toCharArray()) {
            if (counts.containsKey(cha)) {
                counts.put(cha, counts.get(cha) + 1);
            } else {
                counts.put(cha, 1);
            }
        }

        for (Map.Entry<Character, Integer> item : counts.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

//        Set<Map.Entry<Character,Integer>> entries = counts.entrySet();
//        System.out.println(entries);
//        TreeMap<String, String> sorted = new TreeMap<>(counts);
//        Set<Map.Entry<String, String>> mappings = sorted.entrySet();


    }
}
