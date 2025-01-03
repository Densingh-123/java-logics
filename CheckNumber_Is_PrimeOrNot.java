import java.util.Scanner;

public class CheckNumber_Is_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number or not: ");
        int num = sc.nextInt();

        // Check if the number is less than or equal to 1
        if (num <= 1) {
            System.out.print("The provided number is not a prime number: " + num);
        } else {
            boolean isPrime = true;

            // Check divisors from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Not a prime number
                    break; // Exit the loop
                }
            }

            // Output result after the loop
            if (isPrime) {
                System.out.println("The provided number is a prime number: " + num);
            } else {
                System.out.println("The provided number is not a prime number: " + num);
            }
        }
    }
}
