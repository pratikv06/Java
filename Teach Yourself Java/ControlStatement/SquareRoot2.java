/**
 * Program:
 * Accept one command line argument,
 * convert it into Double,
 * and display te square root of that number,
 * if number is negative, square root is pure imaginary number
 */

class SquareRoot2 {
   public static void main(String[] args) {
      double d = Double.valueOf(args[0]).doubleValue();

      if(d < 0){
         System.out.println(Math.sqrt(-d) +"i");
      }
      else {
         System.out.println(Math.sqrt(d));
      }
   }
}