package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void getCountingCharacters(String str) {
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] charArray = str.toLowerCase().toCharArray();

        for (char character : charArray) {
            if (counts.containsKey(character)) {
                counts.put(character, counts.get(character) + 1);
            } else {
                counts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + " : " + count.getValue());
        }

    }





}
