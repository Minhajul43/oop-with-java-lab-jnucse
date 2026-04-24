import java.io.*; //java is the main Java library. io is Input/Output package. * is to import all classes inside the package
import java.util.*; //util is utility package
public class sampleFileInput{
  public static void main (String [] args){
     String [] splitA; 
    try{
       //For windows 
  //File f = new File("C:\\Users\\Test\\input.txt");
        
  //File f = new File("/home/input2.txt"); //For Linux

      Scanner s = new Scanner(f);
      while(s.hasNext()){
        String line = s.nextLine();
        splitA = line.split(",");
        System.out.print("Row: " + splitA[0] + " ");
        System.out.println("Col: " + splitA[1]);
      }
    }catch(Exception e){
      System.out.println("Error: " + e);
    }
  }
}