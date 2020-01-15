/**
 * Program - Find Total of Even and odd number in the array
 */
class IfElseProgram{
   public static void main(String[] args) {
      int number[] = {50, 65, 56, 71, 81};
      int even= 0, odd= 0;
      for(int i=0; i < number.length; i++){
         if(number[i] % 2 == 0)
            even++;
         else
            odd++;
      }
      System.out.println("Even Number : "+ even + "\nOdd Number : " + odd);
   }
}