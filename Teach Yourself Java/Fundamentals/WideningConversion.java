/**
 * Program:
 * illustration of widening conversion
 * 
 * NOTE:
 * WideningConversion: When the type of the left side is larger than 
 *                     the type of the right side
 */

class WideningConversion{
   public static void main(String[] args) {
      byte b = 127;
      int i;
      i = b;
      System.out.println(i);
   }
}