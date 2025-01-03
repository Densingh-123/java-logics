import java.util.Arrays;
import java.util.Collections;

public class BuildInMethodToSort {
public static void main(String[] args) {
	int arr[] = {10,2,3,7,98,45,36,57,95,443,987};
	System.out.println("Array Before Sorting : "+Arrays.toString(arr));
	Arrays.parallelSort(arr);
	System.out.println("Array After Sorting using ParellSort Method: "+Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("Array After Sorting using Sort Method: "+Arrays.toString(arr));
//Reverse Sorting
	Integer a[] = {10,2,3,7,98,45,36,57,95,443,987};
	System.out.println("Array Before Sorting : "+Arrays.toString(arr));
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("Array After Sorting using Reverse Sort Method: "+Arrays.toString(arr));
}
}
