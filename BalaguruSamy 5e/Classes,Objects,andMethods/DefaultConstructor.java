/**
 * Program:
 * Example of default Constructor
 */
class Perimeter{
   int length, breadth;

   Perimeter(){ // Default Constructor
      length = 0;
      breadth = 0;
   }

   Perimeter(int x, int y){ // Patameterised Constructor
      length = x;
      breadth = y;
   }

   void calPerimeter(){
      int peri = 2*(length+breadth);
      System.out.println("The perimeter of Rectangle is " + peri);
   }
}

class DefaultConstructor{
   public static void main(String[] args) {
      Perimeter p1 = new Perimeter(); // Calling Default Constructor
      Perimeter p2 = new Perimeter(5, 10); // Calling Parameterised Constructor
      p1.calPerimeter();
      p2.calPerimeter();
   }
}