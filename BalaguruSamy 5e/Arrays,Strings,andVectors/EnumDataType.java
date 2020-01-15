/**
 * Program:
 * Use of enum type data
 * Finding Weekends
 */

public class EnumDataType{
   enum Days{
      Sunday,
      Monday,
      Tuesday,
      Wednesday,
      Thrusday,
      Friday,
      Saturday
   }

   private static void weekend(Days d){
      if(d.equals(Days.Sunday)){
         System.out.println("Value = " +d+ " is a Holiday");
      }
      else{
         System.out.println("Value = " +d+ " is a Working Day");
      }
   }

   public static void main(String[] args) {
      for(Days d : Days.values()){
         weekend(d);
      }
   }
}