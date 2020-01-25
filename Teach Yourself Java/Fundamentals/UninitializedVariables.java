/**
 * Program:
 * Displaying a variable without its initialization
 */

class UnitializedVariables {
   public static void main(String[] args) {
      char c;
      boolean b;
      System.out.println(c);
      System.out.println(b);
   }
}


/**
 * Expected Output:
 * UninitializedVariables.java:10: error: variable c might not have been initialized
      System.out.println(c);
                         ^
   UninitializedVariables.java:11: error: variable b might not have been initialized
         System.out.println(b);
                           ^
   2 errors
 */