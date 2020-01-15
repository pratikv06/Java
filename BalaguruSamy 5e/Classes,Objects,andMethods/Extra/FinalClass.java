/**
 * Program:
 * Extending Final Class 
 * 
 * Expected Output:
   FinalClass.java:15: error: cannot inherit from final A
      class B extends A{
                      ^
   1 error
 */

final class A{    // remove the final keyword 
   void display(){
      System.out.print("Display in Class A");
   }
}

class B extends A{
   void display(){
      System.out.print("Display in Class B");
   }
}

class FinalClass{
   public static void main(String[] args) {
      B obj = new B();
      obj.display();
   }
}