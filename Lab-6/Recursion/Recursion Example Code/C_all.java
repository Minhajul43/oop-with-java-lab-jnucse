public class C_all{
  
    public C_all() {
    }
    public static void main(String[] args) 
{   
    sayHi(3);
}
    public static void sayHi(int count){
    if(count >0){
      System.out.println("Hi "+count);
      sayHi(count - 1);
    }
    System.out.println("Bye "+count);
  }
    }
