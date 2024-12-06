package com.java.Logics;

import java.util.Arrays;

public class Median_Of_An_Array {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50,60};
	double median = findMedium(arr);
	System.out.print("Median :"+median);
}
public static double findMedium(int arr[]) {
	Arrays.sort(arr);
	int n = arr.length;
	if(n%2==1) {
		return arr[n/2];
	}
	else {
		return (arr[n-1]/2+arr[n/2])/2.0;
	}
	
}
}
