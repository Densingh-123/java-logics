package com.java.Logics;
import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check if it is a Prime Number or Not: ");
        int n = sc.nextInt();

        if (n <= 1) { // Check if the number is less than or equal to 1
            System.out.println(n + " is Not a Prime Number.");
            return;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is Not a Prime Number.");
        }
    }
}
