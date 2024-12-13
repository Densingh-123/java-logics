package com.java.Logics;

public class String_And_String_Buffer {
public static void main(String[] args) {
	String s = new String("Densingh");
	s.concat("is a Developer");
	System.out.println(s);
	System.out.println("---------------------------------");
	StringBuffer sb = new StringBuffer("Densingh");
	sb.append("is a Developer");
	System.out.println(sb);
	System.out.println("---------------------------------");
	String s1 = new String("Densingh");
	String s2 = new String("Densingh");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	StringBuffer s3 = new StringBuffer("Densingh");
	StringBuffer s4 = new StringBuffer("Densingh");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
