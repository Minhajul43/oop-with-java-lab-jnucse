import java.util.Scanner;

public class input_output {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer number:");
    int x = sc.nextInt();
    System.out.print("Here is you integer number:" + x);
    System.out.println();

    System.out.print("Enter a float number:");
    float y = sc.nextFloat();
    System.out.print("Here is your float number:");
    System.out.println();

    System.out.print("Enter a double number:");
    double d = sc.nextDouble();
    System.out.print("Here is your double number:"+d);
    System.out.println();

    System.out.print("Enter a word:");
    String w = sc.next();
    System.out.print("Here is you word:" + w);
    System.out.println();

    System.out.print("Enter a line:");
    String l = sc.nextLine();
    System.out.print("Here is your Line:" + l);
    System.out.println();
    
    System.out.print("Enter a character:");
    String c = sc.next();
    char ch = c.charAt(0);
    System.out.print("Here is your character:" + ch);
    System.out.println();

  }
}