/**
 * Program:
 * Working with vectors and array
 */
import java.util.*;
class VectorExample{
   public static void main(String[] args) {
      Vector list  = new Vector();
      int length = args.length;
      for(int i= 0; i< length; i++){
         list.addElement(args[i]);
      }
      list.insertElementAt("COBOL", 2);
      int size = list.size();
      String listArray[] = new String[size];
      list.copyInto(listArray);
      System.out.println("List of Program:");
      for(int i= 0; i<size; i++){
         System.out.println(listArray[i]);
      }
   }
}


// NOTE
// INPUT
// java VectorExample Ada BASIC C++ FORTRAN Java