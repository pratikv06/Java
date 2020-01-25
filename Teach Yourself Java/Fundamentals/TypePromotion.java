/**
 * Program:
 * Denostrate that the final outcome of an expression will be of the largest type
 */

class TypePromotion{
   public static void main(String[] args) {
      int i = 10;
      float f = 23.25F;
      System.out.println("i * f = "+ i*f);
      System.out.println("100.0f/(10/3) = "+ 100.0f/(10/3) );

      char ch = 'A';
      short s = 12;
      long l = 1234;
      System.out.println("f/ch-(i*1) = "+ (f/ch-(i*1)) );
   }
}