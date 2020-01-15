/**
 * Program:
 * Sum of Square of integer
 */
class SumofSquareofInteger{
   public static void main(String[] args) {
      int n, sum= 0;
      for(n= 1; n<= 10; n++){
         sum += (n*n);
      }
      System.out.println("Sum of Square from 1 to 10 is:" + sum);
   }
}