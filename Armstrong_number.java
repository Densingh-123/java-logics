package com.java.Logics;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }

    static boolean isArmstrong(int n) {
        int digits = 0, temp = n, sum = 0;

        // Count the number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n; // Reset temp to the original number

        // Calculate the sum of digits raised to the power of the number of digits
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        return sum == n;
    }
}
