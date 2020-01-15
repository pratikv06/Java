/**
 * Program:
 * Demonstrate FileOutputStream class use for read bytes to a file
 * Taking file from command line
 */

import java.io.*;
class ReadByte{
   public static void main(String[] args) {
      FileInputStream inFile = null;
      int b;
      try {
         // Connecting to file
         inFile = new FileInputStream(args[0]);
         // Read data from file
         while((b = inFile.read()) != -1){
            System.out.print((char)b);
         }
         inFile.close();
      } catch (IOException e) {
         //TODO: handle exception
         System.out.println(e);
         System.exit(-1);
      }
   }
}