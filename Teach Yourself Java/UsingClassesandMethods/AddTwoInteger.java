/**
 * Program:
 * Accept two command line arguments, and convert them to integers,
 * and display their sum
 */

class AddTwoInteger {
   public static void main(String[] args) {
      // Get first Integer
      int a = Integer.parseInt(args[0]);

      // Get Second Integer
      int b = Integer.parseInt(args[1]);

      // Display sum
      int sum = a + b;
      System.out.println("Summ is "+ sum);
   }
}

// input
//  12 45