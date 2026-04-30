import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[n]; //int arr[] = new int[n];
        
        // Declare and initialize array
        // int[] arr = {1, 2, 3, 4, 5};

        // Step 3: Take input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        // Step 5: Output
        System.out.println("Sum = " + sum);
    }
}

