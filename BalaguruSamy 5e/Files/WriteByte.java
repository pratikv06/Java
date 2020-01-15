/**
 * Program:
 * Demonstrate FileOutputStream class use for writing bytes to a file
 */

import java.io.*;
class WriteByte{
   public static void main(String[] args) {
      byte cities[] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D', 'R', 'A', 'S', '\n', 'M', 'U', 'M', 'B', 'A', 'I'};
      FileOutputStream outfile = null;
      try {
         // Connecting to output file
         outfile = new FileOutputStream("City.txt");
         // Write data to the stream
         outfile.write(cities);
         outfile.close();
      } catch (IOException e) {
         //TODO: handle exception
         System.out.println(e);
         System.exit(-1);
      }
   }
}