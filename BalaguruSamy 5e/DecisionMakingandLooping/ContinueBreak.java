/**
 * Program :
 * Use of Continue and Break staement
 */
class ContinueBreak{
   public static void main(String[] args) {
      LOOP1: 
      for(int i = 1; i < 100; i++){
         System.out.println(" ");
         if(i >= 10)
            break;
         for(int j = 1; j < 100; j++){
            System.out.print("*");
            if(j == i)
               continue LOOP1;
         }
      }
      System.out.println("End of the Program...");
   }
}