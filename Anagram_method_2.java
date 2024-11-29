package com.java.Logics;

import java.util.Arrays;

public class Anagram_method_2 {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1.replaceAll("\\s","");
		s2.replaceAll("\\s","");
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	
public static void main(String[] args) {
	System.out.println(isAnagram("Listen","Silent"));
}
}
