/**
 * Program:
 * Demontration of Shift Operators
 */

class Shift{
   public static void main(String[] args) {
      int a = 8, b = -8;
      System.out.println(":: Value ::");
      System.out.println("a = " +a+ "\tb = " +b);
      System.out.println(":: Shift Operation::");
      System.out.println("a >> 2 = " +(a>>2));
      System.out.println("a << 1 = " +(a<<1));
      System.out.println("a >>> 1 = " +(a>>>1));
      System.out.println("b >> 1 = " +(b>>1));
      System.out.println("b >>> 1 = " +(b>>>1));
   }
}