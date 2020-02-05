/**
 * Program:
 * Array of Five String
 */

class StringArray{
   public static void main(String[] args) {
      String array[] = new String[5];
      array[0] = "String 0";
      array[1] = "String 1";
      array[2] = "String 2";
      // let explicitly not initialized element at position 3
      // null value indicate that variable currently does not refer to any object
      // array[3] = "String 3"; // To initialize, remove the comment from this line
      array[4] = "String 4";

      System.out.println("Array Length = " +array.length);
      System.out.println("Array[0] = " +array[0]);
      System.out.println("Array[1] = " +array[1]);
      System.out.println("Array[2] = " +array[2]);
      System.out.println("Array[3] = " +array[3]);
      System.out.println("Array[4] = " +array[4]);
   }
}