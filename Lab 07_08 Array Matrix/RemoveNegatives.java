import java.util.Arrays;
public class RemoveNegatives {

    // Function to remove negative numbers
    public static int removeNegative(int[] arr) {
        int j = 0; // position to place next valid element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        return j; // new size of array
    }

    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -1, 8};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Original size = " + arr.length);

        // Call function
        int newSize = removeNegative(arr);

        // Print updated array
        System.out.println("Updated array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print new size
        System.out.println(" New size = " + newSize);
    }
}