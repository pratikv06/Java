/**
 * Program:
 * illustrate how to use an array initializer
 */

class ArrayInitializer{
   public static void main(String[] args) {
      // Declare, allocate, and initialize
      int myarray[] = {33, 71, -16, 45};

      // Display length;
      System.out.println("myarray.length = "+ myarray.length);

      // Display elements
      System.out.println(myarray[0] +"\n"+ myarray[1] +"\n"+ myarray[2] +"\n"+ myarray[3]);
   }
}