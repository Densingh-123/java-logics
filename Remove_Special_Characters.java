package String_Logics;

import java.util.Scanner;

public class Remove_Special_Characters {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string with special characters:");
        String input = scanner.nextLine();

        // Call the method to remove special characters
        String result = removeSpecialCharacters(input);

        // Display the result
        System.out.println("String after removing special characters: " + result);

        // Close the scanner
        scanner.close();
    }


    public static String removeSpecialCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the input if it's null or empty
        }

        // Use replaceAll with a regex to remove all characters except letters, digits, and spaces
        return str.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}
