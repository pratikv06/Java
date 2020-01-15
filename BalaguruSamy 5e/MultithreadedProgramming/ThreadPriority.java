/**
 * Program:
 * Setting the prioirty of each thread
 */

import java.lang.Thread;

class ClassJ extends Thread{
   public void run(){
      System.out.println("Thread ClassJ >>>");
      for(int i= 1; i< 5; i++){
         System.out.println("From Thread J : "+ i);
      }
      System.out.println("Thread J ENDS...");
   }
}

class ClassK extends Thread{
   public void run(){
      System.out.println("Thread ClassK >>>");
      for(int j = 1; j< 5; j++){
         System.out.println("From Thread K : "+ j);
      }
      System.out.println("Thread K ENDS...");
   }
}

class ClassL extends Thread{
   public void run(){
      System.out.println("Thread ClassL >>>");
      for(int k= 1; k< 5; k++){
         System.out.println("From Thread L : "+ k);
      }
      System.out.println("Thread L ENDS...");
   }
}

class ThreadPriority{
   public static void main(String[] args) {
      ClassJ thread1 = new ClassJ(); 
      ClassK thread2 = new ClassK();
      ClassL thread3 = new ClassL();

      // Setting Priority of each Thread
      thread3.setPriority(Thread.MAX_PRIORITY); 
      thread2.setPriority(thread1.getPriority() + 1);
      thread1.setPriority(Thread.MIN_PRIORITY);

      System.out.println("Start Thread ClassJ...");
      thread1.start();

      System.out.println("Start Thread ClassK...");
      thread2.start();

      System.out.println("Start Thread ClassL...");
      thread3.start();

      System.out.println("End of Main Thread...");
   }
}