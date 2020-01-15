/**
 * Program:
 * An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
 */
abstract class Bike{
   Bike(){
      System.out.println("Bike is created...");
   }

   abstract void run();

   void changeGear(){
      System.out.println("Gear Changed...");
   }
}

class Hero extends Bike{
   void run(){
      System.out.println("Running Safely...");
   }
}

 class Abstraction2{
    public static void main(String[] args) {
       Bike obj = new Hero();
       obj.run();
       obj.changeGear();

    }
 }