/**
 * Program:
 * Accept two double as commandline argument,
 * multiples these together, 
 * and display its product
 */

class MultipleTwoDouble {
   public static void main(String[] args) {
      // Get first Double
      double a = Double.parseDouble(args[0]);

      // Get second Double
      double b = Double.parseDouble(args[1]);

      // Multipling
      double mul = a * b;
      System.out.println("Multiple is "+ mul);
   
   }
}