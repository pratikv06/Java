/**
 * Program:
 * using file stream classes to copy cotent of a file
 * name 'input.dat' into file called 'output.dat'
 */

import java.io.*;

class CopyCharacter{
   public static void main(String[] args) {
      // Declare and create input and output files 
      File inFile = new File("input.dat");
      File outFile = new File("output.dat");

      // Creating a file stream
      FileReader ins = null;
      FileWriter outs = null;

      try{
         // opening inFile and outFile
         ins = new FileReader(inFile); // If file not present, error
         outs = new FileWriter(outFile); // If file not present, it will create it

         // Read and write till the end
         int ch;
         while((ch = ins.read()) != -1){
            outs.write(ch);
         }
      }
      catch(IOException e){
         System.out.println(e);
         System.exit(-1);
      }
      finally{
         try {
            ins.close();
            outs.close();
         } catch (Exception e) {
         }
      }
   }
}