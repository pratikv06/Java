/**
 * Program:
 * Using the hashtable class
 */

import java.util.*;
class HashTableExample{
   public static void main(String[] args) {
      Hashtable ht = new Hashtable();
      ht.put("Item1", "Apple");
      ht.put("Item2", "Oranges");
      ht.put("Item3", "Grapes");
      ht.put("Item4", "Pine");

      Enumeration e =ht.keys();
      while(e.hasMoreElements()){
         String s = (String)e.nextElement();
         System.out.println("Value : " + ht.get(s));
      }
   }
}