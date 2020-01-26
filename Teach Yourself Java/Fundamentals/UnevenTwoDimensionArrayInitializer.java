/**
 * Program:
 * Show how array initializer is used with two dimension array
 * show how to create a two-dimension array that is not square matrix 
 */

class UnevenTwoDimensionArrayInitializer{
   public static void main(String[] args) {
      // Declare, allocate, initialize
      float myArray[][] = {
         {33.70f, 71.09f },
         {-16f, 45.564f, 50.0f, -7.5f },
         {99.99f }
      };

      // Display length and its element length
      System.out.println("myArray.length = " +myArray.length);
      System.out.println("myArray[0].length = " +myArray[0].length);
      System.out.println("myArray[1].length = " +myArray[1].length);
      System.out.println("myArray[2].length = " +myArray[2].length);

      // Display Element
      System.out.println("myArray[0][0] = " +myArray[0][0]);
      System.out.println("myArray[0][1] = " +myArray[0][1]);
      System.out.println("myArray[1][0] = " +myArray[1][0]);
      System.out.println("myArray[1][1] = " +myArray[1][1]);
      System.out.println("myArray[1][2] = " +myArray[1][2]);
      System.out.println("myArray[1][3] = " +myArray[1][3]);
      System.out.println("myArray[2][0] = " +myArray[2][0]);
   }
}