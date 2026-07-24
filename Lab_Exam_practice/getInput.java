import java.util.Scanner;

public class getInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ennter the Student Name: ");
    String name = sc.nextLine();
    System.out.print("Enter the Student ID: ");
    int id = sc.nextInt();
    System.out.println("Student Name: " + name);
    System.out.println("Student ID: " + id);

  }
}
