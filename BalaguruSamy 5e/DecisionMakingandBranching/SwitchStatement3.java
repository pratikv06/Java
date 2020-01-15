/**
 * Program :
 * Finding Percentage from Grade of the students 
 * using if switch Case
 */
import java.io.*;
class SwitchStatement3{
   public static void main(String[] args) {
      String choice = new String();
      BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
      System.out.println("Choose your division :");
      System.out.println("Honors \nFirst \nSecond \nThird \nFail");
      System.out.print("Enter Your Choice -- ");
      try{
         choice = br.readLine();
         System.out.flush();
         switch(choice){
            case "Honors": System.out.println("Marks >= 80% "); break;
            case "First": System.out.println("Marks >= 65% and < 80%"); break;
            case "Second": System.out.println("Marks >= 55% and < 65%"); break;
            case "Third": System.out.println("Marks >= 40% and < 55%"); break;
            case "Fail": System.out.println("Marks < 40%"); break;
            default: System.out.println("Invalid Choice");
         }
      }
      catch(Exception e){
         System.out.println("I/O Error");
      }
   }
}