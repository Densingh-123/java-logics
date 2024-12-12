package com.java.Logics;

public class Reverse_Word_In_String {
public static void main(String[] args) {
	String data = "Your code is meant to calculate the n-th number in the Fibonacci sequence, but it has an issue. The variable next is declared inside the loop, so it's not accessible outside the loop where you attempt to print it. ";
	String[] value= data.split(" ");
	for(int i=value.length-1;i>=0;i--) {
		System.out.println(value[i]);
		if(1!=0) {
			System.out.print(" ");
		}
	}
	
}
}
