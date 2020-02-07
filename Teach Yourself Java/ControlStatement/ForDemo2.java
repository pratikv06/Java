/**
 * Program:
 * The following program will ony display "terminating" statement
 */

class ForDemo2 {
   public static void main(String[] args) {
      for(int num = 11; num<11; num = num + 1)
         System.out.print(num +" ");
      System.out.print("terminating...");
   }
}