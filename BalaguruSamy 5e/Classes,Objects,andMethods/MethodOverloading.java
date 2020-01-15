/**
 * Program:
 * Example of Method Overloading using Constructor
 * 
 * NOTE:
 *    1. Same name but different parameter list and defination
 *    2. Example of Polymorphism
 */
class Room{
   float length, breadth;
   
   Room(float x, float y){ // Constructor 1
      length = x;
      breadth = y;
   }

   Room(float x){ // Costructor 2
      length = breadth = x;
   }

   float roomArea(){
      return (length*breadth);
   }
}

 class MethodOverloading{
    public static void main(String[] args) {
       Room r1 = new Room(25.0F, 15.0F); // Using Constructor 1
       Room r2 = new Room(20.0F); // Using Constructor 2
       float area1 = r1.roomArea();
       float area2 = r2.roomArea();
       System.out.println("Area1 = " +area1 +"\nArea2 = " +area2);
    }
 }