/**
 * Program:
 * Taking input from keyboard
 * and Terminating it when new line "\n" s found
 * then printing the String on Screen
 */
class StringInputUsingWhile{
   public static void main(String[] args) {
      StringBuffer string = new StringBuffer();
      char c;
      System.out.print("Enter a String : ");
      try{
         while((c= (char)System.in.read()) != '\n'){
            string.append(c);
         }
      }
      catch(Exception e){
         System.out.println("Error in Input");
      }
      System.out.println("Entered String is : " + string);
   }
}