/**
 * Program :
 * Throwing our own exception
 */

import java.lang.Exception;
class MyException extends Exception{
   MyException(String message){
      super(message);
   }
}
class OwnException{
   public static void main(String[] args) {
      int x= 5, y= 1000;
      try{
         float z = (float)x / (float)y;
         if(z < 0.01){
            throw new MyException("Number is to small");
         }
      }
      catch(MyException e){
         System.out.println("Caught MyExecption");
         System.out.println(e.getMessage());
         System.out.println(e);
      }
      finally{
         System.out.println("I'm always here! ;)");
      }
   }
}