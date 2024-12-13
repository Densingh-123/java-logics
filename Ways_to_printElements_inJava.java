package com.java.Logics;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ways_to_printElements_inJava {
public static void main(String[] args) {
	String[] arr = {"one","Den","file","car","bike","aeroplane","car"};
	//method-1
	Arrays.asList(arr).forEach(n->System.out.print(n+" "));
	//method-2
	Arrays.stream(arr).forEach( System.out::println);
	//method-3
	Stream.of(arr).forEach(e->System.out.print(e+" "));
	for(int i=0;i<arr.length;i++) {
		System.out.print("Method - 4 :"+arr[i]);
	}
	for(String s:arr) {
		System.out.print("Method - 5"+s);
	}
	System.out.print(Arrays.toString(arr));
}
}
