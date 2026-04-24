// Testing Class
public class HierarchicalInheritanceTester 
{
  public static void main(String args[]) {
    Two_HI obj1 = new Two_HI();
    Three_HI obj2 = new Three_HI();

    //All classes can access the method of class One
    obj1.printOne();
    obj2.printOne();
  }
}
// Base class
class One_HI // HI stands for Hierarchical Inheritance
{
  public void printOne() {
    System.out.println("printOne() Method of Class One_HI");
  }
}

// Derived class 1
class Two_HI extends One_HI 
{
  public void printTwo() {
    System.out.println("Two() Method of Class Two_HI");
  }
}

// Derived class 2
class Three_HI extends One_HI {
  public void printThree() {
    System.out.println("printThree() Method of Class Three_HI");
  }
}

