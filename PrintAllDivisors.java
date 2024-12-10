package com.java.Logics;
import java.util.Scanner;
public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find the Divisors:");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) { // Loop runs from 1 to n
            if(n % i == 0) { // Check if i is a divisor of n
                System.out.println("The Divisor Or Factor of "+n+" is: " + i);
            }
        }
    }
}
