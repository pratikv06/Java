/**
 * Program:
 * Illustrate the use of runnable class for creating and running threads in an application
 */
class ClassX implements Runnable{
   public void run(){
      for(int i=0; i<5; i++){
         System.out.println("Thread ClassX: "+i);
      }
   }
}

class ClassY implements Runnable{
   public void run(){
      for(int i=0; i<5; i++){
         System.out.println("Thread ClassY: "+i);
      }
   }
}

class RunnableTest{
   public static void main(String[] args) {
      ClassX runnable1 = new ClassX();
      ClassY runnable2 = new ClassY();
      Thread thread1 = new Thread(runnable1);
      Thread thread2 = new Thread(runnable2);
      thread1.start();
      thread2.start();
   }
}