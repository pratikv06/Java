/**
 * Program:
 * Used of nested try catch
 */

class NestedTryCatch{
   public static void main(String[] args) {
      try{
         int a=2, b=4, c=2, x=7, z;
         int p[] = {2};
         p[3] = 33; //Error, Remaining Statement skip

         try{
            z = x/((b*b)-(4*a*c));
            System.out.println("The value of z is " +z);
         }
         catch(ArithmeticException e){
            System.out.println("Divison by zero in Arithmetic expression");
         }
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Array Index is out-of-bound");
      }
   }
}