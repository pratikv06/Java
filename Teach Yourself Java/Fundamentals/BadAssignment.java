/**
 * Program:
 * when the left side is smaller than the type of the right
 */

class BadAssignment{
   public static void main(String[] args) {
      byte b;
      int i = 10;
      b = i;
      System.out.println(b);
   }
}

/**
 * Expected Output:
 * BadAssignment.java:10: error: incompatible types: possible lossy conversion from int to byte
      b = i;
          ^
   1 error
 */