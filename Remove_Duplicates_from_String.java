package com.java.Logics;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Remove_Duplicates_from_String {
public static void main(String[] args) {
	System.out.println("Enter a String To Remove Duplicate Elements in an String : ");
	Scanner sc = new Scanner(System.in);
	String n = sc.next();
	String val=RemoveDuplicate(n);
	System.out.println("The String Without Duplicate Elements : "+val);
}
public static String RemoveDuplicate(String n) {
	Set<Character> data =new HashSet<>();
	StringBuffer sf = new StringBuffer();
	for(int i=0;i<n.length();i++) {
		char c = n.charAt(i);
		if(!data.contains(c)) {
			data.add(c);
			sf.append(c);  
		}
	}
	return sf.toString();
}
}
 