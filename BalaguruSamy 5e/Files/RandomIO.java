/**
 * Program:
 * Reading and writing using Random access file
 */

import java.io.*;
class RandomIO{
   public static void main(String[] args) {
      try{
         // r- read, w- writem > permission given to file
         RandomAccessFile file = new RandomAccessFile("random.dat", "rw"); 
         // Writing into file
         file.writeChar('x');
         file.writeInt(1234);
         file.writeDouble(15.43);
         file.seek(0); // going to the beginning of the file

         // Reading from the file
         System.out.println("1. "+ file.readChar());
         System.out.println("2. "+ file.readInt());
         System.out.println("3. "+ file.readDouble());
         file.seek(2); // Go to second item
         System.out.println("4. "+ file.readInt());
         // Appending boolean value in the file
         file.seek(file.length()); // Seeking to the ed of the file
         file.writeBoolean(false);
         file.seek(4); // Goto 4th Item in file
         System.out.println("5. "+ file.readBoolean());
         file.close();
      }
      catch(IOException e){
         System.out.println(e);
      }
   }
}