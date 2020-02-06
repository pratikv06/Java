/**
 * Program:
 * Initializes an array with five character object,
 * create StringBuffer object,
 * append the array element to String Buffer,
 * Display the String Buffer 
 */

class CharToStringBuffer {
   public static void main(String[] args) {
      // Initializing Character array
      char array[] = {'J', 'A', 'V', 'A', '!'};

      // Initializing StringBuffer
      StringBuffer sb = new StringBuffer();

      // Append to Character array to StringBuffer
      sb.append(array[0]);
      sb.append(array[1]);
      sb.append(array[2]);
      sb.append(array[3]);
      sb.append(array[4]);

      // Display Buffer
      System.out.println("StringBuffer is "+ sb);

   }
}