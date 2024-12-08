package com.java.Logics;
import java.util.Scanner;

public class Palindrome_In_String {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a palindrome: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org = str; // Original string
        String rev = ""; // To store the reversed string

        int len = str.length();
        for (int i = len - 1; i >= 0; i--) { // Loop to reverse the string
            rev += str.charAt(i);
        }

        // Check if the reversed string is equal to the original string
        if (rev.equals(org)) {
            System.out.println("The provided string is a palindrome: " + str);
        } else {
            System.out.println("The provided string is not a palindrome: " + str);
        }
        
        sc.close(); // Close the scanner
    }
}
