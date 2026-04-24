public class My_Calculations extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
 
   public static void main(String args[]) {
      int a = 20, b = 10;
      
      //Superclass reference variable can hold the subclass object, 
      //but using that variable you can access only the members of the superclass
      Calculation demo1 = new My_Calculations();
      
      //to access the members of both classes it is 
      //recommended to always create reference variable to the subclass
      My_Calculations demo = new My_Calculations();  
      
      demo.addition(a, b);
      demo.subtraction(a, b);
      demo.multiplication(a, b);
      
//     demo1.multiplication(a, b);//uncomment and check the error!
//     demo1.subtraction(a, b); // uncomment and check
   }
}
