/**
 * Program:
 * Storing and retriving integers using data stream
 * on a single file
 */

import java.io.*;

class ReadWriteInteger{
   public static void main(String[] args) {
      // Declare data stream
      DataInputStream dis = null;
      DataOutputStream dos = null;
      // File Construct
      File intFile = new File("Number.dat");

      // Writing integer in Number.dat File
      try {
         // Creating output stream for intFIle
         dos = new DataOutputStream(new FileOutputStream(intFile));
         for(int i = 0; i<20 ; i++){
            dos.writeInt((int)(Math.random()*100));
         }
      } catch (IOException e) {
         //TODO: handle exception
         System.out.println(e.getMessage());
      }
      finally{
         try {
            dos.close();
         } catch (Exception e) {
            //TODO: handle exception
         }
      }

      // Reading integer from Number.dat File
      try{
         dis = new DataInputStream(new FileInputStream(intFile));
         for(int i = 0; i< 20; i++){
            int value = dis.readInt();
            System.out.println((i+1)+ ". Value is - " + value);
         }
      } catch(IOException e){
         System.out.println(e.getMessage());
      }
      finally{
         try {
            dis.close();
         } catch (Exception e) {
            //TODO: handle exception
         }
      }

   }
}