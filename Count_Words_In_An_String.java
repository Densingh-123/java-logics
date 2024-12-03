package com.java.Logics;

import java.util.Arrays;

public class Count_Words_In_An_String {
public static void main(String[] args) {
	String str = "Densingh is a Programmer ";
	long count = Arrays.stream(str.split(" ")).count();
	System.out.println(count);
}
}
