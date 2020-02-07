/**
 * Program:
 * Illustrate the use of if-else-if ladder,
 * accept ome command line argument, convert this into int,
 * and display a string reporting of the value is negative, zero, onr,
 * two, three, or greater than three
 */

class IfElseLadder {
   public static void main(String[] args) {
      int i = Integer.parseInt(args[0]);
      if(i < 0)
         System.out.println("Negative Number...");
      else if(i == 0)
         System.out.println("Zero...");
      else if(i == 1)
         System.out.println("One...");
      else if(i == 2)
         System.out.println("Two...");
      else if(i == 3)
         System.out.println("Three...");
      else  
         System.out.println("Greater than Three...");   
      
   }
}