package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingWords {


    public static void getCountingWords(String str) {
        HashMap<String, Integer> counts = new HashMap<>();
        String[] wordArray = str.split(" ");

        for (String word : wordArray) {
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + " : " + count.getValue());
        }
    }

}
