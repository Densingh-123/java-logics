package com.java.Logics;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value to check the given number is palidrome or not : ");
	int a = sc.nextInt();
	int orginal = a;
	int val=0;
	while(a>0) {
		int remainder=a%10;
		val=(val*10)+remainder;
		a/=10;
	}
	if(orginal==val) {
		System.out.println("The Given Number is an Palidrome : "+val);
	}
	else {
		System.out.println("The Given Number is Not an Palidrome : "+val);
	}
	sc.close();
}
}
