/**
 * Program:
 * Illustrate the use of thread class for creating and running threads in an application
 */

// NOTE: Every output will be different
// They are not arranged in sequence
import java.lang.Thread;

class ClassA extends Thread{
   public void run(){
      for(int i= 1; i<= 5; i++){
         System.out.println("From Thread A : "+ i);
      }
      System.out.println("Thread A ENDS...");
   }
}

class ClassB extends Thread{
   public void run(){
      for(int j = 1; j<= 5; j++){
         System.out.println("From Thread B : "+ j);
      }
      System.out.println("Thread B ENDS...");
   }
}

class ClassC extends Thread{
   public void run(){
      for(int k= 1; k<= 5; k++){
         System.out.println("From Thread C : "+ k);
      }
      System.out.println("Thread C ENDS...");
   }
}

class ThreadTest{
   public static void main(String[] args) {
      new ClassA().start(); // One time execution, no need to store object in object variable
      new ClassB().start();
      new ClassC().start();
   }
}