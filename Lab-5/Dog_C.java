public class Dog_C extends Mammal_C {

   public static void main(String args[]) {
      Mammal_C m = new Mammal_C();
      Dog_C d = new Dog_C();

      System.out.println(m instanceof Animal_I);
      System.out.println(d instanceof Mammal_C);
      System.out.println(d instanceof Animal_I);
   }
}

interface Animal_I{}
class Mammal_C implements Animal_I{}

