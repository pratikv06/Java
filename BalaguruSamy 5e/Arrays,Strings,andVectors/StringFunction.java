/**
 * Program:
 * Some most commonly used String methods
 */

class StringFunction{
   public static void main(String[] args) {
      String s1 = "AbCdEfGhI";
      System.out.println("String s1 is: " +s1);

      // Converting this string to lowercase (Return String)
      String s2 = s1.toLowerCase();
      System.out.println("1. Lowercase String s2 is: " + s2);

      // Converting string to Uppercase (Return String)
      String s3 = s1.toUpperCase();
      System.out.println("2. Uppercase String s3 is: " +s3);

      // Replacing 'l' with 'x' (Return String)
      String s4 = "Hello";
      String s5 = s4.replace('l', 'x');
      System.out.println("3. Hello change to: " +s5);

      // Removing the Space at the beginning and end of the string (Return String)
      String s6 = "     Let's Code in Java    ";
      System.out.println("4. Value of String is : " +s6);
      String s7 = s6.trim();
      System.out.println("   Value of String after Trim is: " +s7);

      // Comparing to string (Retuen Boolean)
      if(s1.equals(s2)){
         System.out.println("5. String s1 is equals to String s2");
      }
      else{
         System.out.println("5. String s1 is not equals to String s2");
      }

      // Comparing to string ignoring case (Return Boolean)
      if(s1.equalsIgnoreCase(s2)){
         System.out.println("6. String s1 is equals to String s2");
      }
      else{
         System.out.println("6. String s1 is not equals to String s2");
      }

      // Length of String (Return int)
      int num1 = s1.length();
      System.out.println("7. Length of String s1 is: " +num1);

      // Display a charachter from the String (Return char)
      char value1 = s1.charAt(4);
      System.out.println("8. Character at Position 5 in String s1 is :" +value1);

      // Comparing two String (Return int) - Compare ASCII Value
      // if s1<s2 -> negative    
      // if s1>s2 -> positive     
      // if s1==s2 -> zero    
      int num2 = s1.compareTo(s2);
      int num3 = s1.compareTo(s3);
      int num4 = s1.compareTo(s1);
      System.out.println("9. Comparing String s1 and s2: " + num2+ " ,means s1<s2");
      System.out.println("   Comparing String s1 and s3: " + num3+ " ,means s1>s3");
      System.out.println("   Comparing String s1 and s1: " + num4+ " ,means s1==s2");

      // Concatenating String (Return String)
      String s8 = s1.concat(s2);
      System.out.println("10. Concatenating String s1 and s2: " +s8);
      
      // Substring from a String (Return String)
      String s9 = s8.substring(12); // substring start from 12 position
      String s10 = s8.substring(3, 10); // Substring start from 3 to 10 (excluding 10)
      System.out.println("11. Substring of string s8 from position 12: " +s9);
      System.out.println("    Substring of string s8 from position 3 to 10: " + s10);

      // Finding to first occurance of the char in string (Return int)
      int num5 = s8.indexOf('d'); 
      int num6 = s8.indexOf('d', 10); // Find after 10 position
      System.out.println("12. Position of 'd' in String s8 is: " +num5);
      System.out.println("    Position of 'd' in String s8 (After position 10) is: " +num6);

      // 


   }
}