package com.java.Logics;

public class Reverse_Array {
public static void main(String[] args) {
	int[] data= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<=data.length;i++) {
		System.out.print("Orginal Array : "+data[i]+" ");
	}
	for(int i=data.length-1;i>=0;i--){
		System.out.print("Reversed Array : "+data[i]+" ");
	}
}
}
