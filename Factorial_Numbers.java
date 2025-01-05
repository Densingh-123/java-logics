import java.util.Scanner;
public class Factorial_Numbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number to find the factorial of the Number : ");
	int num=sc.nextInt();
	long factorial = 1;
	//using ascending order
	for(int i=1;i<=num;i++) {
		factorial = factorial*i;
	}
	// using Descending order
	for(int i=num;i>=1;i--) {
		factorial = factorial*i;
	}
	System.out.println("The Factorial of " +num+" is "+ factorial);
}
}
