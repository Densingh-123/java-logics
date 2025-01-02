import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int arr[] = {10,2,3,7,98,45,36,57,95,443,987};
	System.out.println("Array Before Sorting : "+Arrays.toString(arr));
	int n = arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("Array After Sorting : "+Arrays.toString(arr));
}
}
