/**
 * Program:
 * Application of Single inheritance
 * 
 * NOTE:
 *    1. Old Class   -> Base Class
 *                   -> Super Class
 *                   -> Parent Class
 *    2. New Class   -> Sub Class
 *                   -> Derived Class
 *                   -> Child Class
 *    3. Inheritance allow subclasses to inherit all the variables and methods 
 *       of their parent class
 *    4. Different Forms   -> Single Inheritance (Only one super class)
 *                         -> Multiple Inheritance (Several super class)
 *                         -> Heirarchical Inheritance (One super class, many subclass)
 *                         -> Multilevel Inheritance (Derived from a derived Class)
 *    5. Java does not implement multiple inheritance directly
 *    6. This concept is implemented using a secondary inhertiance path in form 
 *       of "interfaces"
 *    7. "extends" keyword is used for inheritance
 * 
 * Super:
 *    1. Use to invoke the constructor of the superclass
 *    2. May only used within a subclass constructor method
 *    3. To call superclass constructor, super must be the first statement in subclass constructor
 *    4. Order and type of the parameter in super call must be same as declared in superclass
 */

 class Room{
    int length, breadth;
    
    Room(int x, int y){
       length = x;
       breadth = y;
    }

    int area(){
       return (length * breadth);
    }
 }

 class BedRoom extends Room{ // Inheriting Room class
    int height;
    BedRoom(int x, int y, int z){
       super(x, y); // Passing value to constructor of superclass
       height = z;
    }

    int volume(){
       return (length * breadth * height); //
    }
 }

 class SigleInheritance{
    public static void main(String[] args) {
      BedRoom room1 = new BedRoom(14, 12, 10);
      int area1 = room1.area();          // Superclass Method
      int volume1 = room1.volume();      // Baseclass Method
      System.out.println("Area : " +area1 +"\nVolume : " +volume1);    
   }
 }