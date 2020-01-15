/**
 * Program:
 * Creating fille interactively from keyboard input
 */

import java.io.*; // For StringTokenizer class
import java.util.*;

class Inventory{
   static DataInputStream dis = new DataInputStream(System.in);
   static StringTokenizer st;

   public static void main(String[] args) throws IOException{
      DataOutputStream dos = new DataOutputStream(new FileOutputStream("invent.dat"));
      // Reading From Console
      System.out.print("Enter Code Number : ");
      st = new StringTokenizer(dis.readLine());
      int code = Integer.parseInt(st.nextToken());

      System.out.print("Enter Number of items : ");
      st = new StringTokenizer(dis.readLine());
      int items = Integer.parseInt(st.nextToken());
   
      System.out.print("Enter Cost : ");
      st = new StringTokenizer(dis.readLine());
      double cost = new Double(st.nextToken()).doubleValue();

      // Writing in "invent.dat"
      dos.writeInt(code);
      dos.writeInt(items);
      dos.writeDouble(cost);
      dos.close();
      dis.close();

      // Processing data from file:
      DataInputStream dis = new DataInputStream(new FileInputStream("invent.dat"));
      int codeNumber = dis.readInt();
      int itemsCount = dis.readInt();
      double itemCost = dis.readDouble();
      double totalCost = itemsCount * itemCost;
      dis.close();

      // Writing into Console
      System.out.println("*******************");
      System.out.println("Code Number : " +codeNumber);
      System.out.println("Items Count : " +itemsCount);
      System.out.println("Total Items : " +itemCost);
      System.out.println("Total Cost : " +totalCost);
   }
}