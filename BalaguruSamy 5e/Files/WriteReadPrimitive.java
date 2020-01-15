/**
 * Program:
 * Demonstrates the use of data streams for reading and writing 
 * primitive data types
 */

import java.io.*;

class WriteReadPrimitive{
   public static void main(String[] args) throws IOException {
      File primitive = new File("primitive.dat"); 
      // Writing 
      FileOutputStream fos = new FileOutputStream(primitive);
      DataOutputStream dos = new DataOutputStream(fos);

      dos.writeInt(1009);
      dos.writeDouble(234.12);
      dos.writeBoolean(true);
      dos.writeChar('A');
      dos.close();
      fos.close();

      // Reading
      FileInputStream fis = new FileInputStream(primitive);
      DataInputStream dis = new DataInputStream(fis);

      System.out.println(dis.readInt());
      System.out.println(dis.readDouble());
      System.out.println(dis.readBoolean());
      System.out.println(dis.readChar());
      dis.close();
      fis.close();
   }
}