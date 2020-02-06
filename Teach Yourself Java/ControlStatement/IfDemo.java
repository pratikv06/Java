/**
 * Program:
 * Simple use of if statement
 */

class IfDemo {
   public static void main(String[] args) {
      if(args.length == 0) {
         System.out.println("You must have command line argument");
      }
      if(args.length != 0) {
         System.out.println("First Argument value is "+ args[0]);
      }

      // NOTE: if condition should only contain boolean values
      
      // if(1+1) {
      //    System.out.println("This will generate error");
      // }
   }
}