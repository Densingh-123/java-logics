package String_Logics;

import java.util.Scanner;

public class Remove_WiteSpace_In_String {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string with white spaces:");
        String input = scanner.nextLine();

        // Call the method to remove white spaces
        String result = removeWhiteSpaces(input);

        // Display the result
        System.out.println("String after removing white spaces: " + result);

        // Close the scanner
        scanner.close();
    }

    public static String removeWhiteSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the input if it's null or empty
        }

        // Use the replaceAll method with a regex to remove all white spaces
        return str.replaceAll("\\s+", "");
    }
}
