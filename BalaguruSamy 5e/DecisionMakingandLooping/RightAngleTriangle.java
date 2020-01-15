/**
 * Program:
 * Displaying right angle triangle of '@'
 * using nested for loops
 */
class RightAngleTriangle{
   public static void main(String[] args) {
      int p, q;
      System.out.println("The right angle Triangle of @ is shown Below:");
      for(p=1; p <= 9; p++){
         for(q=1; q <= p; q++){
            System.out.print("@");
         }
         System.out.println();
      }
   }
}