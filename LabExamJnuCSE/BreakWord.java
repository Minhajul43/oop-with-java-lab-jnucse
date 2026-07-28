import java.util.Scanner;

public class BreakWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word:");
    String w = sc.next();
    System.out.print("Here is you broken word into characters:");
    for (int i = 0; i < w.length(); i++) {
      System.out.println(w.charAt(i) + " ");
    }
    sc.close();
    
  }
}