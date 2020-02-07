/**
 * Program:
 * Print the number between 1 to 100 that can be evenly divided by 17
 */

class DivideBy17 {
   public static void main(String[] args) {
      for(int i= 1; i<=100; i= i+1){
         if(i%17 == 0)
            System.out.print(i +" ");
      }
   }
}