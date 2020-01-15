/**
 * Program:
 * Manipulation of String
 * (StringBuffer)
 */

class StringManipulation{
   public static void main(String[] args) {
      StringBuffer str = new StringBuffer("Object language");
      System.out.println("Original String is: "+ str);

      // obtaining string length;
      int size = str.length();
      System.out.println("Length of String is: " +size);

      // Accessing characters in a string
      for(int i = 0; i< size; i++){
         System.out.println("Character at pisition: "+(i+1)+ " is " +str.charAt(i));
      }

      // Inserting a string in the middle
      String str1 = new String(str.toString());
      int pos = str1.indexOf(" language");
      str.insert(pos, " Oriented");
      System.out.println("Modified string is: " + str);
      
      // Modifying character
      str.setCharAt(6, '-');
      System.out.println("Now string is: " +str);

      // Appending a string at the end
      str.append(" improves security.");
      System.out.println("Appended String: " +str);
   }
}