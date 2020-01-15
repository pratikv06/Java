/**
 * Program:
 * Illustrates the use of varargs to print the string value passed as an 
 * argument to a method using command line argument
 */
class MultipleArgument1{
   String str1;

   MultipleArgument1(String... varargs){
      for(int i = 0; i < varargs.length; i++){
         str1 = varargs[i];
         System.out.println("Hello, "+ str1);
      }
   }

   public static void main(String[] args) {
      new MultipleArgument1(args);
   }

}


/**
 * Input
 * java MultipleArgument1 John Paul David maxwell
 */