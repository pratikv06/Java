/**
 * Program:
 * use of binary Search Mehtod
 */

import java.util.*;
class BinarySearch{
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      list.add(new String("Java"));
      list.add(new String("is"));
      list.add(new String("platform"));
      list.add(new String("Independent"));

      System.out.println("LinkedList : " +list);
      
      Comparator r = Collections.reverseOrder();
      Collections.sort(list, r);
      Iterator iter = list.iterator();
      
      System.out.print("Reverse List : ");
      while(iter.hasNext()){
         System.out.print(iter.next() + " ");
      }

      Collections.shuffle(list);
      iter = list.iterator();
      System.out.print("\nShuffled List : ");
      while(iter.hasNext()){
         System.out.print(iter.next() + " ");
      }

      System.out.println("\nMinimum : " +Collections.min(list));
      System.out.println("Maximum : " +Collections.max(list));

   }
}