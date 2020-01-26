/**
 * Program:
 * Display first ten character from the string
 * and last ten character from the string
 */

class FirstTenChar{
   public static void main(String[] args) {
      String s = new String("One Two Three Four Five Six Seven Eight Nine Ten");
      String str = s.substring(0, 10); // 0 - starting index, 10 - ending index (Excluding)
      System.out.println("Starting 10 character: " +str);

      int length = s.length();
      String str1 = s.substring(length-10);
      System.out.println("Last 10 character: " +str1);
   }
}