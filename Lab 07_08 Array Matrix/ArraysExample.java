import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {5, 2, 9, 1, 6};
        
        // Print array using Arrays.toString()
        System.out.println("Original array: " + Arrays.toString(arr));

        // Print array with loop
        System.out.print("Printing array using loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
//            if (i < arr.length - 1) {
//                System.out.print(", ");
//            }
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));
    }
}
