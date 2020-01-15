/**
 * Program:
 * Application of classes and object
*/
class Rectangle{
   int length, width; //Declaration of Variable
   
   void getData(int x, int y){ //Defination of method
      length = x;
      width = y;
   }

   int rectArea(){
      int area = length * width;
      return area;
   }
}

class ClassObject{
   public static void main(String[] args) {
      int area1, area2;
      Rectangle rect1 = new Rectangle(); // Creating Object
      Rectangle rect2 = rect1; // Assigning one object reference variable to another

      // Accessing Variable
      rect1.length = 12;
      rect1.width = 20;
      area1 = rect1.length * rect2.width;

      // Accesssing Methods
      rect2.getData(20, 15);
      area2 = rect2.rectArea();
      
      // Displaying Values
      System.out.println("Area 1 = "+ area1 +"\nArea 2 = "+ area2);
   }
}