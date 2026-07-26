import java.util.Scanner;

public class WordBreaking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Word:");
    String w = sc.nextLine();
    System.out.print("Here is  broken word into characters:");
    for (int i = 0; i < w.length(); i++) {
      System.out.println(w.charAt(i) + " ");
    }
    sc.close();
    
  }
}