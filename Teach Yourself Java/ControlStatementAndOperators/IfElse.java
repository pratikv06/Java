/**
 * Program:
 * If-else Statemenet
 */

class IfElse {
   public static void main(String[] args) {
      int i = Integer.parseInt(args[0]);

      if(i>0)
         if(i>3)
            System.out.println("i>0 and i>3");
         else  
            System.out.println("i>0 and i<3");
      else 
         System.out.println("i<=0");
   }
}