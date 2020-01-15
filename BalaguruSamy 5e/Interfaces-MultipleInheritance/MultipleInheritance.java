/**
 * Program:
 * Implementing multiple inheritance
 */

class Student{
   int rollNumber;

   void getNumber(int n){
      rollNumber = n;
   }
   
   void putNumber(){
      System.out.println("Roll No: " +rollNumber);
   }
}

class Test extends Student{
   float part1, part2;

   void getMarks(float m1, float m2){
      part1 = m1;
      part2 = m2;
   }

   void putMarks(){
      System.out.println("Marks Obtained");
      System.out.println("Part 1: " +part1+ "\nPart 2: "+ part2);
   }
}

interface Sports{
   float sportWt = 6.0F;
   void putwt();
}

class Result extends Test implements Sports{ // Extending class and implementing interface
   float total;
   
   public void putwt(){
      System.out.println("Sport Wt: " +sportWt);
   }

   void display(){
      total = part1 + part2 + sportWt;
      putNumber();
      putMarks();
      System.out.println("Total Score: " + total);
   }
}

class MultipleInheritance{
   public static void main(String[] args) {
      Result obj = new Result();
      obj.getNumber(1234);
      obj.getMarks(27.5F, 33.0F);
      obj.display();
   }
}