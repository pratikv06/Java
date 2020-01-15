/**
 * Program :
 * Use of wrapper class methods
 */
import java.io.*;
class WrapperClass{
   static float loan(float p, float r, int y){
      int year = 1;
      float sum = p;
      while(y >= year){
         sum = sum *(1+r);
         year++;
      }
      return sum;
   }

   static void printline(){
      for(int i = 1; i<= 30; i++){
         System.out.print("-");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Float principalAmount = new Float(0); //Converting Number to object
      Float interestRate = new Float(0);
      int numYears = 0;
      try{
         DataInputStream in =new DataInputStream(System.in);
         
         System.out.print("Enter Principal Amount: ");
         System.out.flush();
         String principalString = in.readLine();
         principalAmount = Float.valueOf(principalString);  // String object to number object
         
         System.out.print("Enter Interest Rate: ");
         System.out.flush();
         String interestString = in.readLine();
         interestRate = Float.valueOf(interestString);

         System.out.print("Enter Number of Year: ");
         System.out.flush();
         String yearString = in.readLine();
         numYears = Integer.parseInt(yearString);
      }
      catch(IOException e){
         System.out.println("I/O Error");
         System.exit(1);
      }

      float value = loan(principalAmount.floatValue(), interestRate.floatValue(), numYears);
      printline();
      System.out.println("Final Value = " +value);
      printline();
   }
}


/**
 * Input Value:
 * Enter Principal Amount: 5000
   Enter Interest Rate: 0.15
   Enter Number of Year: 4
 */