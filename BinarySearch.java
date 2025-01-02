import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find the data present in an array: ");
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = sc.nextInt();

        int l = 0;
        int h = arr.length - 1;
        boolean found = false;

        while (l <= h) {
            int m =  (l+h) / 2; // Recalculate midpoint in each iteration

            if (arr[m] == key) {
                System.out.println("Key found in the array at index: " + m);
                found = true;
                break;
            }

            if (arr[m] < key) {
                l = m + 1; // Search in the right half
            } else {
                h = m - 1; // Search in the left half
            }
        }

        if (!found) {
            System.out.println("Key not found in the array");
        }

        sc.close(); // Close the scanner
    }
}
