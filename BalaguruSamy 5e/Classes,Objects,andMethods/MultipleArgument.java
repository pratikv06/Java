/**
 * Program:
 * Illustrates the use of varargs to print the string value passed as an 
 * argument to a method
 */
 class MultipleArgument{

   MultipleArgument(String ...person){
      for(String name : person){
         System.out.println("Hello " +name);
      }
    }

   public static void main(String[] args) {
      new MultipleArgument("John", "David", "Suhel", "Paul");   // object is refered but not stored in variable 
   }

 }
