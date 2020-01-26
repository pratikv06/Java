/**
 * Program:
 * output the binary, hex, and octal forms of an int value
 */

class BinaryHexOctal{
   public static void main(String[] args) {
      int i = 11;
      System.out.println("Binary is " +Integer.toBinaryString(i));
      System.out.println("Hex is " +Integer.toHexString(i));
      System.out.println("Octal is " +Integer.toOctalString(i));
   }
}