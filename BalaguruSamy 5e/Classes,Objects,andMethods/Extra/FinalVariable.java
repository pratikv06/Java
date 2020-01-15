/**
 * Program:
 * Chaging the value of final Variable
 * 
 * Expected Output:
   FinalVariable.java:10: error: cannot assign a value to final variable VALUE
      VALUE = 5; // Comment this line
      ^
   1 error
 */
class FinalVariable{
   static final int VALUE=10;

   public static void main(String[] args) {
      
      VALUE = 5; // Comment this line 
      // System.out.println(VALUE); //Uncomment this line
   }
}

