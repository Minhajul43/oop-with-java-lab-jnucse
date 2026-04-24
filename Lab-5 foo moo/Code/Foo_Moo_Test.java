public class Foo_Moo_Test
 {
    
    public static void main(String[] args) 
    {                                                                                                 
     System.out.println("Foo Moo output");
     
     // object creation of Foo class
            Foo foo1 = new Bar();
            Foo foo2 = new Baz();
            Bar bar1 = new Bar();
            Baz baz1 = new Baz();
            Baz baz2 = new Mumble();
            Object obj1 = new Bar();
            Foo foo3 =new Mumble(); 
         // Mumble baz3 = new Baz(); // 
            
   // Method calling from Foo class:
   //foo1.method1();     
   //foo2.method1();    
   //bar1.method1();  
   //baz1.method1();   
   //baz2.method1();
   //obj1.method1(); 
   //foo1.method2();  
   //foo2.method2();                       
   //bar1.method2(); 
   //baz1.method2();
   //baz2.method2(); 
   //foo3.method2();
   //foo3.method4(); 
   
  //  Casting, Compile and Run time error: 
  // ((Baz)obj1).method2(); 
  // ((Object)bar1).method3();  
  // ((Foo)baz2).method3();
  //((Foo)baz2).method2();
  // ((Bar)foo1).method3();
  // ((Mumble)baz1).method3();
  // ((Mumble)baz2).method3();
  // ((Baz)foo2).method3();
  // ((Bar)foo2).method2(); 
  // ((Foo)obj1).method2();         
         
            
        
    }
}

                                                                                                                                        
                             


