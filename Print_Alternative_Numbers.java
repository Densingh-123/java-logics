package com.java.Logics;

public class Print_Alternative_Numbers {
public static void main(String[] args) {
	  int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

      System.out.println("Alternate numbers in the array:");
     for(int i=0;i<numbers.length;i+=2) {
    	 System.out.print(numbers[i]+" ");
     }
}
}
