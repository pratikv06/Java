/**
 * Program:
 * 
 */

import java.io.*;
class RandomAccess{
   public static void main(String[] args) {
      try {
         RandomAccessFile file = new RandomAccessFile("City.txt", "rw");
         file.seek(file.length());
         file.writeBytes("\nAHEMDABAD");
      } catch (Exception e) {
         //TODO: handle exception
         System.out.println(e);
      }
   }
}