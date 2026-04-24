public class Tester2 {
   public static void main(String[] args) {
      Address ad= new Address(10, "Dhaka", "Dhaka", "Bangladesh");
      Student st= new Student(1, "Akash", ad);
      System.out.println("Roll no: "+ st.rno);
      System.out.println("Name: "+ st.stName);
      System.out.println("Street: "+ st.stAddr.strNum);
      System.out.println("District: "+ st.stAddr.district);
      System.out.println("Division: "+ st.stAddr.division);
      System.out.println("Country: "+ st.stAddr.country);
   }
}
class Address {
   int strNum;
   String district;
   String division;
   String country;

   Address(int street, String c, String st, String country) {
      this.strNum = street;
      this.district = c;
      this.division = st;
      this.country = country;
   }
}
class Student {
   int rno;
   String stName;

   Address stAddr;
   Student(int roll, String name, Address address){
      this.rno = roll;
      this.stName = name;
      this.stAddr = address;
   }
}

