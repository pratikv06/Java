/**
 * Program:
 * Assigning one array variable to another
 */

class ArrayReference{
   public static void main(String[] args) {
      // Declare and allocate space for array1
      float array1[];
      array1 = new float[3];

      // Initialize array1
      array1[0] = -3.45f;
      array1[1] = 7.7f;
      array1[2] = 101.43f;

      // Declare and allocate space for array2
      float array2[] = new float[3];

      // making array2 refer to the same array as array1
      array2 = array1;

      // Display the element of array1;
      System.out.print("array1: ");
      System.out.print(array1[0] +" ");
      System.out.print(array1[1] +" ");
      System.out.println(array1[2]);

      // change an element
      array2[1] = 100;

      // Display the element of array1;
      System.out.print("array1: ");
      System.out.print(array1[0] +" ");
      System.out.print(array1[1] +" ");
      System.out.println(array1[2]);

      // Display the element of array2
      System.out.print("array2: ");
      System.out.print(array2[0] +" ");
      System.out.print(array2[1] +" ");
      System.out.println(array2[2]);
   }
}