import java.util.Scanner;
//Write a program to input a character and print the ASCII code of that character.
public class AssciCode {
  public static void main(String[] arga) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character:");
    String s = sc.nextLine();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int ascii = (int) c;
      System.out.println("The ASCII code of " + c + " is: " + ascii);
    }
    sc.close();
  }
}
