class MethodOverloading {
    // Main driver method
    public static void main(String[] args)
    {
        Product ob = new Product();
        int prod1 = ob.multiply(1, 2);
       System.out.println("Product of the two integer value :" + prod1);
  
        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);
  
        // Printing product of 3 numbers
        System.out.println( "Product of the three integer value:" + prod2);
    }
}
