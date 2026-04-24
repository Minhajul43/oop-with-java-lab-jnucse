public class SingleInheritanceTester extends One {
  public static void main(String args[]) {
    // Creating object of the derived class
    SingleInheritanceTester obj = new SingleInheritanceTester();

    // Calling method
    obj.printOne();
  }
}
class One {
  public void printOne() {
    System.out.println("printOne() method of One class.");
  }
}
