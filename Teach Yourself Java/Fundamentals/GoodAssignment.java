/**
 * Program:
 * when the left side is smaller than the type of the right
 * way to fix this problem is by using a type cast
 */

class GoodAssignment{
   public static void main(String[] args) {
      byte b;
      int i = 10;
      b = (byte)i;
      System.out.println(b);
   }
}