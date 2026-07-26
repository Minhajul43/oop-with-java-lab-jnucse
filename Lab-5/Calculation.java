import java.io.*;
import java.util.Scanner;
class Calculation {
   int z;
 
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
 
   public void subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:" + z);
   }
   

   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:" + z);
   }

   public void division(int x, int y) {
      z = x / y;
      System.out.println("The quotient of the given numbers:" + z);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter first number:");
      int a = sc.nextInt();
      System.out.print("Enter second number:");
      int b = sc.nextInt();
      Calculation cal = new Calculation();
      cal.addition(a, b);
      cal.subtraction(a, b);
      cal.multiplication(a, b);
      cal.division(a, b);
   }
}

