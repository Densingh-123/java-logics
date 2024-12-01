package com.java.Logics;

public class Compare_Strings_inJAVA {
public static void main(String[] args) {
	String s1 = new String("FullStack-Developer");
	String s2 = new String("fullstack-developer");
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s2));
}
}
