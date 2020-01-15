/**
 * Program :
 * Adding the number from 1 to 10
 * and Printing the final sum
 */
class AdditionofNumber{
   public static void main(String[] args) {
      int sum= 0, n=1;
      while(n<=10){
         sum += n;
         n++;
      }
      System.out.println("Addition of 1 to 10 is : " + sum);
   }
}