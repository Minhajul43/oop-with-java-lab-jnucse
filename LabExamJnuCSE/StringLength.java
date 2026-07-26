import java.util.Scanner;
//Input a word into a String. Print the length of the word, that is,how many characters / symbols / spaces are there.
public class StringLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Sentence:");
    String s = sc.nextLine();
    System.out.print("Length of the sentence is:" + s.length());
    sc.close();
    
  }
}