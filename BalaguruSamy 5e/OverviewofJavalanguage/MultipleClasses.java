class Room{
   // Here Length and breadth are called "Data Members"
   float length;
   float breadth;

   void getdata(float a, float b){
      length = a;
      breadth = b;
   }
}

class MultipleClasses{
   public static void main(String args[]){
      float area;
      Room room1 = new Room(); //Creating the Object room1 of class Room 
      // Dot Operator is used to access the variable and method of room Class
      room1.getdata(14, 10);
      area = room1.length * room1.breadth;
      System.out.println("Area = " + area);
   }
}

