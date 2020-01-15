import java.util.*;
public class ArrayListCollection{
   public static void main(String a[]){
      ArrayList<Integer> list = new ArrayList<Integer>();
      Numberlist(list);
      int total= 0;
      Iterator<Integer> iter = list.iterator();
      while(iter.hasNext()){
         Integer val = iter.next();
         total = total + val;
      }
      System.out.println("The Total Amount is " + total);
   }
   private static void Numberlist(ArrayList<Integer> list){
      list.add(new Integer(1));
      list.add(new Integer(2));
      list.add(new Integer(21));
      list.add(new Integer(12));
      list.add(new Integer(2344));
      list.add(new Integer(323));
   }
}