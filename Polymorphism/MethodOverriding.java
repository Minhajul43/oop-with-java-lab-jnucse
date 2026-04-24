// Driver class
class MethodOverriding  {
  // Main driver method
  public static void main(String[] args)
  { 
    // Creating object of Parent or helper class 1
    Parent a;
    // Now we will be calling print methods
    // inside main() method
    a = new Subclass1();
    a.Print();
    
    a = new Subclass2();
    a.Print();
    
    Parent p = new Parent();
    p.Print();
  }
}

// Helper class 1
class Parent {
  // Method of parent class
  void Print() { System.out.println("Print method of parent class"); }
}

// Helper class 2
class Subclass1 extends Parent {
  // Method
  void Print() { System.out.println("Print method of subclass1"); }
}

// Helper class 3
class Subclass2 extends Parent { 
  // Method
  void Print() { System.out.println("Print method of subclass2"); }
}
