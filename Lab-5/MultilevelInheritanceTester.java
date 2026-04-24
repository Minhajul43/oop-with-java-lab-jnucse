public class MultilevelInheritanceTester extends Two_MLI // MLI stands for Multi Level Inheritance
{
  public static void main(String args[]) {
    // Creating object of the derived class
    MultilevelInheritanceTester obj = new MultilevelInheritanceTester();

    // Calling methods
    obj.printOne();
    obj.printTwo();
  }
}
class One_MLI {
  public void printOne() {
    System.out.println("printOne() method of One_MLI class.");
  }
}

class Two_MLI extends One_MLI {
  public void printTwo() {
    System.out.println("printTwo() method of Two_MLI class.");
  }
}

