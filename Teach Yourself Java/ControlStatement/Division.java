/**
 * Program:
 * Accept two Command line argument,
 * then convert them to double,
 * divide first number by second,
 * use and if-else statement to prevent division by zero
 */

class Division {
   public static void main(String[] args) {
      double d1 = Double.valueOf(args[0]).doubleValue();
      double d2 = Double.valueOf(args[1]).doubleValue();

      if(d2 > 0)
         System.out.println(d1 +" / "+ d2 +" = "+ d1/d2);
      else  
         System.out.println("Cannot be Divide by Zero...");
   }
}