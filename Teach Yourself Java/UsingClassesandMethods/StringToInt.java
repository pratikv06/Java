/**
 * Program:
 * Illustrate how some of the Integer static and instance method
 */

class StringToInt{
   public static void main(String[] args) {
      String s = "125";
      Integer obj = Integer.valueOf(s); // valueOf() - static method of class Integer
      int i = obj.intValue(); // intValue() - instance method of class Integer
      i += 10;
      System.out.println(i);
      
      // Can be combined as
      int x = Integer.valueOf(s).intValue();
      System.out.println(x);

      // Or we can use parseInt() method
      int y = Integer.parseInt(s);
      y++;
      System.out.println(y);
   }
}