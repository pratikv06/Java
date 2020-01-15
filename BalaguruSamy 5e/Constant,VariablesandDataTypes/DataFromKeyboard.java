/**
readLine()
Deprecated.

This method does not properly convert bytes to characters. As of JDK 1.1, the preferred way to read lines of text is via the BufferedReader.readLine() method. Programs that use the DataInputStream class to read lines can be converted to use the BufferedReader class by replacing code of the form:

DataInputStream d = new DataInputStream(in);
with: BufferedReader d = new BufferedReader(new InputStreamReader(in));
*/

import java.io.DataInputStream;
// For Buffered Class Reader
// import java.io.InputStreamReader;
// import java.io.BufferedReader;

class DataFromKeyboard{
   public static void main(String args[]){
      DataInputStream in = new DataInputStream(System.in);
      // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int intNumber=0;
      float floatNumber=0.0f;
      try{
         System.out.print("Enter an Integer: ");
         intNumber = Integer.parseInt(in.readLine());
         System.out.print("Enter a Float Number: ");
         floatNumber = Float.parseFloat(in.readLine());
      }
      catch(Exception e){}
      System.out.println("intNumber = " + intNumber);
      System.out.println("floatNumber = " + floatNumber);
   }
}


