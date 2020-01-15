/**
 * Program:
 * Using try and catch for exception handling
 */
class Error3{
   public static void main(String[] args) {
      int a=10, b=5, c=5;
      int x,y;
      try{
         x= a/(b-c);
         c= a+b+c; // this statement will be skipped, because of above statement
      }
      catch(ArithmeticException e){
         System.out.println("Divison by Zero");
      }  // Program did not stop at the point of exception condition
      y = a/(b+c);
      System.out.println("y = "+y+"\nc = "+c);
   }
}