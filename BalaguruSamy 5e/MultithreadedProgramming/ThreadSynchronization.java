/**
 * Program:
 * Illustrate the importance of Synchronization in a multithreaded program
 */

class Pyramid{
   synchronized void draw(char ch){
      for(int i = 0; i< 10; i+=2){
         for(int k = 10-i; k > 0; k-=2){
            System.out.print(" ");
         }
         for(int j = 0; j<=i; j++){
            System.out.print(ch);
         }
         System.out.println();
      }
   }
}

class Class1 extends Thread{
   Pyramid p;
   Class1(Pyramid p){
      this.p = p;
   }

   public void run(){
      p.draw('*');
   }
}

class Class2 extends Thread{
   Pyramid p;
   Class2(Pyramid p){
      this.p = p;
   }

   public void run(){
      p.draw('#');
   }
}

class ThreadSynchronization{
   public static void main(String[] args) {
      Pyramid objP = new Pyramid();
      Class1 thread1 = new Class1(objP);
      Class2 thread2 = new Class2(objP);
      thread1.start();
      thread2.start();
   }
}