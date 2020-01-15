/**
 * Program:
 * using multiple catch block, with 'finally' block
 */

class MultipleCatch{
   public static void main(String[] args) {
      int a[]= {5, 10}, b= 5;
      try{
         int x = a[2] / b -a[1];
      } //Multiple Catch Statement
      catch(ArithmeticException e){
         System.out.println("Error: Division by zero");
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error: Array index error");
      }
      catch(ArrayStoreException e){
         System.out.println("Error: Wrong data type");
      }
      finally{
         int y = a[1] / a[0];
         System.out.println("y = "+y);
      }
   }
}