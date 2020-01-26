/**
 * Program:
 * Search a string for currency value
 */

class DollarAmount{
   public static void main(String[] args) {
      String s1 = "The Total Cost is $45.67";
      int index = s1.indexOf('$');
      String s2 = s1.substring(index);
      System.out.println(s2);
   }
}