/**
 * Program:
 * Concatenating and buffering of files
 */

import java.io.*;
class SequenceBuffer{
   public static void main(String[] args) throws IOException{
      // Declare and open file streams
      FileInputStream file1 = new FileInputStream("text1.dat");
      FileInputStream file2 = new FileInputStream("text2.dat");

      // Declare and concatenete file1 and file2 into file3
      SequenceInputStream file3 = new SequenceInputStream(file1, file2);

      // Create Buffer input and output stream
      BufferedInputStream inBuffer = new BufferedInputStream(file3);
      BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

      // Read and write till the end of the file3
      int ch;
      while((ch=inBuffer.read()) != -1){
         outBuffer.write((char)ch);
      } 

      // Closing Buffers and streams
      inBuffer.close();
      outBuffer.close();
      file1.close();
      file2.close();


   }
}