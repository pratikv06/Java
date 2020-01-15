/**
 * Program:
 * Overriding the final method
 * 
 * Expected Output:
   FinalMethod.java:16: error: run() in PrintValue cannot override run() in Display
      void run(){
           ^
      overridden method is final
   1 error
 */

class Display{
   final void run(){
      System.out.println("From class - Display");
   }
}

class PrintValue extends Display{
   void run(){ //change name run to run1
      System.out.println("From class - PrintValue");
   }
}

class FinalMethod{
   public static void main(String[] args) {
      PrintValue obj = new PrintValue();
      obj.run();
      // obj.run1(); //uncomment this after change in run method
   }
}