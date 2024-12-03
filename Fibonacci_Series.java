package com.java.Logics;
import java.util.Scanner;
public class Fibonacci_Series {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number To loop until Fibonacci Number : ");
	int n = sc.nextInt();
	int firstNum=0,secondNum=1,nextNum;
	for(int i=1;i<=n;i++) {
		System.out.print(firstNum+", ");
		nextNum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=nextNum;
	}
}

}
 