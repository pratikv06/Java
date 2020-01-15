/**
 * Program:
 * Extending class from the user defined package
 */

import package2.ClassB;
class ClassC extends ClassB{
   int n = 200;
   void displayC(){
      System.out.println("Path of this Method: ClassC.displayC();");
      System.out.println("Value = "+value +"\tn = " +n);
   }
}

class PackageTest3{
   public static void main(String[] args) {
      ClassC objC = new ClassC();
      objC.displayC();
      objC.displayB();
   }
}