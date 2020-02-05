/**
 * Program:
 * Create StringBuffer object by using the three forms of constructor,
 * display their current capacity and size,
 * use of append method,
 * insert char at beginning of the string,
 * and illustrate the operation of the reverse() method
 */

class StringBufferDemo{
   public static void main(String[] args) {
      // initialize the Buffer size to 16 char
      StringBuffer sb1 = new StringBuffer();
      // Buffer capacity to the specified size
      StringBuffer sb2 = new StringBuffer(30); 
      // initialize the Buffer with the specified string and also reverse another 16 char for expansion
      StringBuffer sb3 = new StringBuffer("abcde");
      
      // Display 
      System.out.println("Displaying Capacity of the StringBuffer:");
      System.out.println("1. sb1.capacity() = " +sb1.capacity());
      System.out.println("   sb1.length()   = " +sb1.length());
      
      System.out.println("2. sb2.capacity() = " +sb2.capacity());
      System.out.println("   sb2.length()   = " +sb2.length());
      
      System.out.println("3. sb3.capacity() = " +sb3.capacity());
      // Here, the string length is 5 and 16 more is added, then final capacity is 5 + 16 = 21
      System.out.println("   sb3.length()   = " +sb3.length());

      System.out.println("Appending String at the End of the String:");
      sb3.append("xyz");
      System.out.println("1. Value of String sb3 is: " +sb3);
      System.out.println("2. sb3.capacity() = " +sb3.capacity()); 
      System.out.println("3. sb3.length()   = " +sb3.length());

      System.out.println("Reversing a String:");
      sb3.reverse();
      System.out.println("1. Value of String sb3 is: " +sb3);

      System.out.println("Appending at Start of the String:");
      StringBuffer sb4 = new StringBuffer("Original String ");
      sb4.insert(0, "Start of the Buffer, ");
      System.out.println("1. By using Insert method: " +sb4);
      sb4.reverse();
      sb4.append(new StringBuffer("Reverse String at Start, ").reverse());
      sb4.reverse();
      System.out.println("2. By using append and reverse method: " +sb4);
   }
}