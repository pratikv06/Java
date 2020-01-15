/**
 * Program:
 * Use of enhanced for loop, also called as each loop
 */
class ForEachLoop{
   public static void main(String[] args) {
      int num[] = {56, 48, 79, 24, 60};
      for(int k : num){
         if(k> 50 && k<100)
            System.out.println("The Selected Value is " + k);
      }
   }
}