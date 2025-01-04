import java.util.Arrays;

public class CheckTwoArrayEqualOrNot {
public static void main(String[] args) {
	System.out.print("check the arrays are equal or not : ");
	int[] a1 = {1,2,3,4,5};
	int[] a2 = {1,2,3,4,5};
	boolean status = Arrays.equals(a1, a2);
	if(status==true) {
		System.out.println("Arrays are  equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
	//with out using .equals method
	
	boolean state = true;
	if(a1.length == a2.length) {
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				state=false;
			}
		}
	}
	else {
		state=false;
		System.out.println("Arrays are not equal");
	}
	if(state==true) {
		System.out.println("Arrays are  equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
}
}
