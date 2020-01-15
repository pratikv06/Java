/**
 * Program:
 * Example of using the stack class
 */

import java.util.*;
class StackExample{
   public static void main(String[] args) {
      Stack st = new Stack();
      st.push("Java");
      st.push("C");
      st.push("Python");
      st.push("Perl");
      st.push("PHP");

      System.out.println("Stack Element : " +st);
      System.out.println("Top Element : " +st.peek());
      System.out.println("Pop Element : "+ st.pop());
      System.out.println("Element after pop : "+ st);
      System.out.println("Searching : " +st.search("PHP"));
   }
}