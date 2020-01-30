/**
 * Program:
 * use of isInfinite() and isNaN() method
 */

class DoubleDemo{
   public static void main(String[] args) {
      // Declare and initialize variables
      double d1 = 0;
      double d2 = 0;

      // Divide these values
      double d3 = d1/d2;
      System.out.println("d1/d2 = "+ d3);

      // Test for infinity and nan
      System.out.println(Double.isInfinite(d3));
      System.out.println(Double.isNaN(d3));

      // Display max, min, and infinity values
      System.out.println(Double.MAX_VALUE);
      System.out.println(Double.MIN_VALUE);
      System.out.println(Double.POSITIVE_INFINITY);
      System.out.println(Double.NEGATIVE_INFINITY);
   }
}