/**
 * Program:
 * Creates and initializes a 3x2 matrix
 * finally, the value of the array elements are displayed
 */

class TwoDimensionalArray{
   public static void main(String[] args) {
      // Declare and allocate space
      int myArray[][] = new int[3][2];

      // Initialize elements
      myArray[0][0] = 33;
      myArray[0][1] = 71;
      myArray[1][0] = -16;
      myArray[1][1] = 45;
      myArray[2][0] = 99;
      myArray[2][1] = 27;

      // Display length 
      System.out.println("myArray.length = " +myArray.length);

      // Display elements
      System.out.println("myArray[0][0] = " +myArray[0][0]);
      System.out.println("myArray[0][1] = " +myArray[0][1]);
      System.out.println("myArray[1][0] = " +myArray[1][0]);
      System.out.println("myArray[1][1] = " +myArray[1][1]);
      System.out.println("myArray[2][0] = " +myArray[2][0]);
      System.out.println("myArray[2][1] = " +myArray[2][1]);
   }
}