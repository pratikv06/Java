/**
 * Program:
 * Illustrate the use of wait() and notify() for pupose
 * of inter-thread communication
 */

class Circle{
   float radius = 0.0F;
   synchronized void output(){
      System.out.println("Output Method for displaying area of circle..");
      if(radius == 0.0F){
         System.out.println("Waiting for input radius..");
         try{
            wait(); // Going to sleep mode
         }
         catch(Exception e){
         }
      }
      System.out.println("Area = " +(3.14*radius*radius));
   }

   synchronized void input(float r){
      System.out.println("Inputting radius...");
      radius = r;
      System.out.println("Radius value received..");
      notify(); // Resuming the first thread went to sleep
   }
}

class InterThreadCommunication{
   public static void main(String[] args) {
      final Circle obj = new Circle();

      new Thread(){
         public void run(){
            obj.output();
         }
      }.start();

      new Thread(){
         public void run(){
            obj.input(2.5F);
         }
      }.start();
   }
}