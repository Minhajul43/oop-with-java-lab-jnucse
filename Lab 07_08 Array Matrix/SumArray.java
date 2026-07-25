import java.util.Scanner;
public class SumArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, sum = 0;
    System.out.print("Enter the size of the array:");
    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];

    }
    System.out.print("The sum of the array elements is:" + sum);
  }
}
