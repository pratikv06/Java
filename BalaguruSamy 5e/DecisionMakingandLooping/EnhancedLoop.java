/**
 * Program:
 * More Exaple of Enhanced Loop
 */
import java.util.*;
class EnhancedLoop{
   public static void main(String[] args) {
      String states[] = {"TamilNadu", "AndraPradesh", "UttarPradesh", "Rajasthan"};
      // Standard Loop
      System.out.println(":: Standard Loop ::");
      for(int i=0; i< states.length; i++){
         System.out.println("State Name : " + states[i]);
      }
      // Enhanched Loop
      System.out.println("\n :: Enhanced Loop ::");
      for(String i : states){
         System.out.println("State Name : " + i);
      }
      // Standard Loop on ArrayList
      ArrayList<String> cities = new ArrayList<String>();
      cities.add("Delhi");
      cities.add("Mumbai");
      cities.add("Calcutta");
      cities.add("Chennai");
      cities.add("Pune");

      System.out.println("\n:: Standard Loop ::");
      for(int i = 0; i < cities.size(); i++){
         System.out.println("City Name : " + cities.get(i));
      }
      // Enhanched Loop on ArrayList
      System.out.println("\n :: Enhanced Loop ::");
      for(String city : cities){
         System.out.println("State Name : " + city);
      }

      // In Collection
      System.out.println("\n :: In  Collection ::");
      printcollection(cities);
   }

   public static<AnyType> void printcollection(Collection<AnyType> c){
      for(AnyType val : c){
         System.out.println(val);
      }
   }
}