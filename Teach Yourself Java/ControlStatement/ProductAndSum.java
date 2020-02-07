/**
 * Program:
 * Compute the product and sum of the number from 1 to 5
 */

class ProductAndSum {
   public static void main(String[] args) {
      int sum = 0;
      int product = 1;
      for(int i = 1; i<6; i = i+1){
         sum = sum + i;
         product = product * i;
      }
      System.out.println("Sum: "+ sum +"\nProduct: "+ product);
   }
}