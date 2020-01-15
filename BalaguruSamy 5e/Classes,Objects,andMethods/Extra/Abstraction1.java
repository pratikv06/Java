/**
 * Program:
 * Create the instance of Rectangle class, draw() method of Rectangle class will be invoked.
 */
abstract class Shape{
   abstract void draw();
}

class Rectangle extends Shape{
   void draw(){
      System.out.println("Drawing Rectangle...");
   }
}

class Circle extends Shape{
   void draw(){
      System.out.println("Drawing Circle...");
   }
}

class Abstraction1{
   public static void main(String[] args) {
      Rectangle obj1 = new Rectangle();
      Circle obj2 = new Circle();
      obj1.draw();
      obj2.draw();

   }
}