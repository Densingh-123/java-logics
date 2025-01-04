import java.util.Scanner;
public class Count_No_Of_Digits {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a set of Number to find the digits of number :");
int count = 0;
int num = sc.nextInt();
while(num!=0) {
	num/=10;
	count++;
}
System.out.println("The number of Digits is :"+ count);
}
}
