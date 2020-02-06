/**
 * Program:
 * Accept one Commandline argument,
 * convert it into int,
 * and disply if that number is even or odd
 */

class EvenOdd{
   public static void main(String[] args) {
      int i = Integer.parseInt(args[0]);

      if(i%2 == 0){
         System.out.println("Number is Even");
      }
      if(i%2 != 0){
         System.out.println("Number is Odd");
      }
   }
}