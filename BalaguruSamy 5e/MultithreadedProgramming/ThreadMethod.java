/**
 * Program:
 * Illustrate the use of yield(), sleep(), and stop()
 */

import java.lang.Thread;

class ClassG extends Thread{
   public void run(){
      for(int i= 1; i<= 5; i++){
         if(i== 1)
            yield(); 
         System.out.println("From Thread G : "+ i);
      }
      System.out.println("Thread G ENDS...");
   }
}

class ClassH extends Thread{
   public void run(){
      for(int j = 1; j<= 5; j++){
         System.out.println("From Thread H : "+ j);
         if(j== 3)
            stop();
      }
      System.out.println("Thread H ENDS...");
   }
}

class ClassI extends Thread{
   public void run(){
      for(int k= 1; k<= 5; k++){
         System.out.println("From Thread I : "+ k);
         if(k== 1)
         try{
            sleep(1000);
         }
         catch( Exception e){

         }
      }
      System.out.println("Thread I ENDS...");
   }
}

class ThreadMethod{
   public static void main(String[] args) {
      ClassG thread1 = new ClassG(); 
      ClassI thread3 = new ClassI();

      System.out.println("Start Thread ClassG...");
      thread1.start();

      System.out.println("Start Thread ClassH...");
      thread2.start();

      System.out.println("Start Thread ClassI...");
      thread3.start();

      System.out.println("End of Main Thread...");
   }
}