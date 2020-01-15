/**
 * Program:
 * Example of using hte vector class
 */

import java.util.*;
class VectorExample{
   public static void main(String[] args) {
      Vector fruits = new Vector();
      fruits.add("Apple");
      fruits.add("Mango");
      fruits.add("Oranges");
      fruits.add("Grapes");
      fruits.add("Pine");
      Iterator it = fruits.iterator();
      while(it.hasNext()){
         System.out.println(it.next());
      }
   }
}