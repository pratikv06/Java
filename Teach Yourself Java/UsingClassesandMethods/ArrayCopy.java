/**
 * Program:
 * use of the arraycopy() method
 */

class ArrayCopy {
   public static void main(String[] args) {
      int array1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      int array2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      System.arraycopy(array1, 0, array2, 0, 5);
      System.out.println("Array2: ");
      System.out.print(array2[0] +" ");
      System.out.print(array2[1] +" ");
      System.out.print(array2[2] +" ");
      System.out.print(array2[3] +" ");
      System.out.print(array2[4] +" ");
      System.out.print(array2[5] +" ");
      System.out.print(array2[6] +" ");
      System.out.print(array2[7] +" ");
      System.out.print(array2[8] +" ");
      System.out.print(array2[9] +" ");
   }
}
