/**
 * Program :
 * Selecting the Booklet for City
 */
class SwitchStatement2{
   public static void main(String[] args) {
      char choice;
      System.out.println("Select your Choice :");
      System.out.println("M --> Madras");
      System.out.println("B --> Mumbai");
      System.out.println("C --> Calcutta");
      System.out.print("Choice -- ");
      System.out.flush(); // Clear the o/p stream after writing the left-over bytes (if any).
      try{
         switch(choice = (char) System.in.read()){
            case 'M':
            case 'm': System.out.println("Madras : Booklet 5"); break;
            case 'B':
            case 'b': System.out.println("Mumbai : Booklet 9"); break;
            case 'C':
            case 'c': System.out.println("Calcutta : Booklet 15"); break;
            default: System.out.println("Invalid Choice (IC)");
         }
      }
      catch(Exception e){
         System.out.println("I/O Error");
      }
   }
}