package com.java.Logics;
import java.util.Scanner;
public class String_Palindrome_Checker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter a String To Reverse it : ");
	String  str = sc.next();
	String org_str = str;
	String rev = "";
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
		
	}
	System.out.println("The Reversed String is : "+rev);
if(org_str.equals(rev)) {
	System.out.println("The Reversed String is a Palinddrome : "+rev);
}
else {
	System.out.println("The Reversed String is Not An Palindrome : "+rev);
}
}
}
