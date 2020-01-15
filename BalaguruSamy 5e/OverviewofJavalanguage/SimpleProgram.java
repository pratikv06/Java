// class is a keyword, which is object-oriented construct, used to declares new class
class SimpleProgram{
   // main method - Starting point to begin the execution of the program (must include in every program)
   // A Java App may contain multiple classes, only one main method to initiate the executaion
   // public (Access Specifier) - Declare that main method is unprotected, therfore making it accessiable 
   //                             to all other classes
   //  static - Declares this method as one that belong to the entire class, not a part of any object of that class
   //  void - return type of main method
   public static void main(String args[]){
      // System - Class
      // out - Object
      // println - method of object out, append new line at the end of the string
      // JAVA STATEMENT MUST END WITH A SEMICOLON (;)
      System.out.println("Java is Object Oriented Programming Language!!!");
   }
}