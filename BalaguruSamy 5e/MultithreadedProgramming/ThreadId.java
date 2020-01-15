/**
 * Program:
 * Getting the Id of each thread
 */

class ClassM extends Thread{
   public void run(){
      System.out.println(">Thread - ClassM\t >Thread ID - "+ Thread.currentThread().getId()+ "\t >Thread Priority - "+ Thread.currentThread().getPriority());
   }
}

class ClassN extends Thread{
   public void run(){
      System.out.println(">Thread - ClassN\t >Thread ID - "+ Thread.currentThread().getId()+ "\t >Thread Priority - "+ Thread.currentThread().getPriority());
   }
}

class ClassO extends Thread{
   public void run(){
      System.out.println(">Thread - ClassO\t >Thread ID - "+ Thread.currentThread().getId()+ "\t >Thread Priority - "+ Thread.currentThread().getPriority());
   }
}

class ThreadId{
   public static void main(String[] args) {
      ClassM obj1 = new ClassM(); 
      ClassN obj2 = new ClassN();
      ClassO obj3 = new ClassO();

      obj1.setPriority(Thread.MIN_PRIORITY);
      obj2.setPriority(Thread.NORM_PRIORITY);
      obj3.setPriority(Thread.MAX_PRIORITY);

      System.out.println(">This is Main Thread\t >Thread Id - "+ Thread.currentThread().getId()+ "\t >Thread Priority - "+ Thread.currentThread().getPriority());
      System.out.println("Let's call the other threads in the sequence ClassM > ClassN > ClassO");
      
      obj1.start();
      obj2.start();
      obj3.start();
      
   }
}