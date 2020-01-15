/**
 * Program:
 * Use of Throw
 */

class UsingThrow{
   static void divide() throws ArithmeticException{
      int x= 22, y= 0, z;
      z = x / y;
   }

   public static void main(String[] args) {
      try{
         divide();
      }
      catch(ArithmeticException e){
         System.out.println("Caught Exception: " +e);
      }
   }
}