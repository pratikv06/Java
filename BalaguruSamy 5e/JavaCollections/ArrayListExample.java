/**
 * Program;
 * Using the methods of the arraylist class
 */

import java.util.*;
class ArrayListExample{
   public static void main(String[] args) {
      ArrayList arraylist = new ArrayList();
      // Displaying Size
      System.out.println("Initial size of arraylist - " +arraylist.size());
      // Adding element
      arraylist.add("A");
      arraylist.add("B");
      arraylist.add("C");
      arraylist.add("D");
      
      System.out.println("Size of arraylist after adding the element - "+arraylist.size());
      // Printing Arraylist
      System.out.println("Contents of arraylist "+ arraylist);
      // Add at position Number 3, as array start with zero
      arraylist.add(2, "E");
      System.out.println("After Changing the arraylist by adding element at given index - "+ arraylist);
      // Removing Element from arraylist
      // Element at position 4 will be removed, as array start with zero
      arraylist.remove(3);
      arraylist.remove("A");
      System.out.println("After Removing element from arraylist - "+arraylist);
   }
}