/**
 * Program:
 * Display all the factors of the number enterd by the user 
 */

class NumberFactor {
   public static void main(String[] args) {
      int num = Integer.parseInt(args[0]);

      for(int i= 2; i<=num/2; i= i+1){
         if(num%i == 0)
            System.out.print(i +" ");
      }
   }
}