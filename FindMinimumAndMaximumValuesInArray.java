
public class FindMinimumAndMaximumValuesInArray {
public static void main(String[] args) {
	int[] a = {10,100,20,300,340,890,674,34,54,7,8,2,90};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("The maximum value is : "+max);
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("The manimum value is : "+min);
}
}

