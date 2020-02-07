/**
 * Program:
 * Accept one command line argument,
 * and cheeck if its a prime number or not
 */

class PrimeTest {
   public static void main(String[] args) {
      int num = Integer.parseInt(args[0]);

      // Test for prime
      boolean prime = true;
      for(int i =2; i<=num/2; i =i+1)
         if(num%i == 0)
            prime = false;
      
      // Display
      if(prime == true)
         System.out.println("The number is Prime Number.");
      else 
         System.out.println("The number is not a Prime Number.");
   }
}