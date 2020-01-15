/**
 * Program:
 * Calling run() method directly instead of calling the start() method
 */
import java.lang.Thread;

class ClassD extends Thread{
   public void run(){
      for(int i= 1; i<= 5; i++){
         System.out.println("From Thread A : "+ i);
      }
      System.out.println("Thread A ENDS...");
   }
}

class ClassE extends Thread{
   public void run(){
      for(int j = 1; j<= 5; j++){
         System.out.println("From Thread B : "+ j);
      }
      System.out.println("Thread B ENDS...");
   }
}

class ClassF extends Thread{
   public void run(){
      for(int k= 1; k<= 5; k++){
         System.out.println("From Thread C : "+ k);
      }
      System.out.println("Thread C ENDS...");
   }
}

class DirectRun{
   public static void main(String[] args) {
      new ClassD().run(); // One time execution, no need to store object in object variable
      new ClassE().run();
      new ClassF().run();
   }
}


/**
 * Since the direct call to run() method from main does not create a
 * seperate call stack, its instructions are executes sequentially aand not parallely.
 * Thus, calling the run() method directly causes the program to 
 * behave like normal single-threaded program
 */