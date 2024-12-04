package com.java.Logics;
import java.util.HashSet;
public class FindDuplicatesInArray {
public static void main(String[] args) {
	HashSet<Integer> h = new HashSet();
//Brute force Approach - By checking all the elements in an array one by one
//	int[] arr= {1,2,3,4,5,6,7,7,8,9,1,2};
//	boolean flag=false;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;i<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				System.out.println("Duplicate Element Found :"+i);
//				flag=true;
//			}
//		}
//		if(flag=false) {
//			System.out.println("Duplicate Element Not Found");
//		}
//	}
	
	
	
	
	
	//optimal solution to solve this problem by using hash set -> because hashSet does not contain duplicates
//	int[] arr= {1,2,3,4,5,6,7,7,8,9,1,2};
//	boolean flag=false;
//	for(int val:arr) {
//		if(h.add(val)==false) {
//			System.out.println("Duplicate Element Found :"+val);
//			flag=true;
//		}
//	}
//	if(flag==false) {
//		System.out.println("Duplicate Element Not Found");
//	}
	
	
	
	
	int[] arr= {1,2,3,4,5,6,7,7,8,9,1,2};
	boolean flag=false;
	for(int num:arr) {
		if(h.contains(num)) {
			System.out.println("Duplicate Element Found :"+num);
			flag=true;
		}
		h.add(num);
	}
	if(flag=false) {
		System.out.println("Duplicate Element Not Found :");
	}
}
}
