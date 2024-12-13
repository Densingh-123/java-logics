package com.java.Logics;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class Streams {
public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(4,2,1,5,6,7,8,9,7,52);
//	Stream <Integer> data = nums.stream();
//	data.forEach(n->System.out.print(n));
	nums.stream()
	.filter(n->n%2==1)
	.sorted()
	.map(n->n*2)
	.forEach(n->System.out.println(n));	
}
}
