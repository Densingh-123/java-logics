package com.java.Logics;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        if (s1.length() != s2.length()) {
            System.out.println("Not An Anagram");
        } else {
            // Convert strings to char arrays
            char[] String1 = s1.toCharArray();
            char[] String2 = s2.toCharArray();

            // Sort both char arrays
            Arrays.sort(String1);
            Arrays.sort(String2);

            // Check if sorted arrays are equal
            if (Arrays.equals(String1, String2)) {
                System.out.println("The Strings Are Anagrams");
            } else {
                System.out.println("The Strings Are Not Anagrams");
            }
        }
    }
}
