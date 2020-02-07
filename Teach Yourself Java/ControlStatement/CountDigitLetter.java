/**
 * Program:
 * Accept one command line argument,
 * count the number of digits and letter in that string,
 * and display that values
 */

class CountDigitLetter {
   public static void main(String[] args) {
      int letter = 0;
      int digit = 0;
      for(int i=0; i< args[0].length(); i =i+1){
         char ch = args[0].charAt(i);
         if(Character.isDigit(ch))
            digit = digit +1;
         else if(Character.isLetter(ch))
            letter = letter + 1;
      }

      System.out.println("There are "+ digit +" digits");
      System.out.println("There are "+ letter +" letters");
   }
}