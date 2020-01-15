/**
 * Program:
 * Catching invalid command line arguments
 */

class TryCatch{
   public static void main(String[] args) {
      int invalid=0, number, count=0;
      for(int i = 0; i<args.length; i++){
         try{
            number = Integer.parseInt(args[i]);
         }
         catch(NumberFormatException e){
            invalid++;
            System.out.println("Invalid Number : " +args[i]);
            continue;
         }
         count++;
      }
      System.out.println("Valid Numbers = "+count+ "\nInvalid Numbers = "+ invalid);
   }
}

// Input:
// java TryCatch 15 25.75F 40 Java 10.65F 65