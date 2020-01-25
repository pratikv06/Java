/**
 * Program:
 * illustrate the size of the type on the left side of the assignment 
 * can be insufficient to contain the value on the right side
 */

class NarrowingConversion{
   public static void main(String[] args) {
      byte b;
      int i = 2343;
      b = (byte) i;
      System.out.println(b);
   }
}