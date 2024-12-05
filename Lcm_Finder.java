package com.java.Logics;
import java.util.Scanner;
public class Lcm_Finder {
public static void main(String[] args) {
	System.out.println("Enter Two Number To Find The LCM ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int a = sc.nextInt();
	System.out.println("Enter Second Number : ");
	int b = sc.nextInt();
	int lcm=(a>b)?a:b;
	while(true) {
		if(lcm%a==0&& lcm%b==0) {
			System.out.println("The Lcm is : "+lcm);
			break;
		}
		++lcm;
	}
}
}
