package com.java.Logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_NonRepeated_Character {
    public static void main(String[] args) {
        try {
            char c = getFirstNonRepeatedCharacter("aabbccde");
            System.out.println("The First Non-Repeated Character is: " + c);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static char getFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> count = new LinkedHashMap<>(str.length());

        // Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Throw an exception if no non-repeated character is found
        throw new RuntimeException("No non-repeated character found");
    }
}
