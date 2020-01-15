/**
 * Program:
 * Copying byte from one file to another
 */

import java.io.*;
class CopyByte{
   public static void main(String[] args) {
      // Declare input and output file stream
      FileInputStream inFile = null;
      FileOutputStream outFile = null;
      // Declare variable to hold value
      byte byteRead;

      try {
         // connecting to infile
         inFile = new FileInputStream("in.dat");
         // Connecting to outfile
         outFile = new FileOutputStream("out.dat");
         // Reading from 'in.dat', writing in 'out.dat'
         do{
            byteRead = (byte)inFile.read();
            outFile.write(byteRead);
         } while(byteRead != -1);
      } catch (FileNotFoundException e) {
         //TODO: handle exception
         System.out.println("File Not Found!!");
      } catch(IOException e){
         System.out.println(e.getMessage());
      }
      finally{
         try {
            inFile.close();
            outFile.close();
         } catch (Exception e) {
            //TODO: handle exception
         }
      }
      
   }
}