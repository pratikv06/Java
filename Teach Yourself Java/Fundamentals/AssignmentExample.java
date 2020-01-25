/**
 * Program:
 * Some example of assigning values to variable
 */

class AssignmentExample{
   public static void main(String[] args) {
      char ch = 'A';
      int i = ch;
      System.out.println(i);

      byte b1 = 1;
      byte b2 = 2;
      byte b3 = (byte) (b1 * b2); // must convert to byte
      System.out.println(b3); 

      short s1 = 1;
      short s2 = (short) (s1 + 1); // must convert to short
      System.out.println(s2);
   }
}