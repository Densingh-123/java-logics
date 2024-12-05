package com.java.Logics;
import java.util.Scanner;
public class Greatest_Common_Divisor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("To Find The Greatest Common Divisor Of Two Numbers ");
	System.out.println("Enter First Number : ");
	int num_1 = sc.nextInt();
	System.out.println("Enter Second Number : ");
	int num_2 = sc.nextInt();
	int gcd=1;
	for(int i=1;i<=num_1 && i<=num_2;i++) {
		if(num_1%i==0 && num_2%i==0) {
			gcd=i;//intially 1 is stored in gcd variable when it override it gets the largest common divisor
		}
	}
	System.out.println("The Greatest Common Divisor is : "+gcd);
}
}
